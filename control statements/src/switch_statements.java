
import java.util.Scanner;

public class switch_statements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the btech branches: ");
		String ch = sc.nextLine();
		
		switch(ch){
			case "CSE":
				System.out.println("Java, Python, c,c++,sql");
				break;
			case "ECE":
				System.out.println("ECA, LIC, ss, DE, Emdedded, vlsi");
				break;
			case "EEE":
				System.out.println("Circuits, Transforms, switches,");
				break;
			case "CIVIL":
				System.out.println("House, flat, construction");
				break;
			case "MECH":
				System.out.println("motors, machines");
				break;
			case "IT":
				System.out.println("DBMS, c, c++");
				break;
			default:
				System.out.println("choose above");
				break;
		}

	}

}
