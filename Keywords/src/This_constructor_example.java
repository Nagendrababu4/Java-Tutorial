

public class This_constructor_example {
	
	int age;
	String name;
	String city;
	
	This_constructor_example(int age, String name, String city){
		
		this.age = age;
		this.name = name;
		this.city = city;
	}
	

	public static void main(String[] args) {
		This_constructor_example obj = new This_constructor_example(23, "Anirudh", "Hyderabad");
		System.out.println("person age is: "+ obj.age);
		System.out.println("name of the person is : "+ obj.name);
		System.out.println("native place is : "+ obj.city);
		// TODO Auto-generated method stub

	}

}
