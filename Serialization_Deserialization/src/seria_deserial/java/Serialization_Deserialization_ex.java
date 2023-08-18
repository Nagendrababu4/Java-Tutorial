package seria_deserial.java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Example implements Serializable{
	int id;
	String name;
	public Example(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
public class Serialization_Deserialization_ex{
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Example obj = new Example(14369, "Ashok");
		String filename = "java.txt";
		//Serialization
		System.out.println("..Serialization...");
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(obj);

		os.close();
		System.out.println("Serialization completed"+'\n');
		
		//Deserialization
		System.out.println("...Deserialization....");
		FileInputStream fs = new FileInputStream(filename);
		ObjectInputStream oi = new ObjectInputStream(fs);
		
		Example ex = (Example)oi.readObject();
		System.out.println(ex.id);
		System.out.println(ex.name);
		oi.close();
		System.out.println("Deserialization completed");	
	}
}
