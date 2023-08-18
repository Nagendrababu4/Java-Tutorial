package hotel.java;

import java.util.Scanner;

import hotel.java.login.display;

class login{
	private int login_id = 1234;
	public void run() {
		System.out.println("login details........");
		Scanner obj = new Scanner(System.in);
		System.out.println("enter ac_num: ");
		int password = obj.nextInt();
		if (login_id == password) {
			System.out.println("login successfully");
		}
		else if (login_id != password){
			System.out.println("please check your login details");
	 }
}		
public class display{
	int id;
	String name;
	int mobile;
	String address;
	int date_in;
	int date_out;
	
	public void details(int id, String name, int mobile, String address) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
//		this.date_in = date_in;
//		this.date_out = date_out;
	}
	public void details_display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Mobile number: "+mobile);
		System.out.println("Address: "+address);
		System.out.println("date_in: "+date_in);
		System.out.println("date_out: "+date_out);
	}
}
//	int id;
//	String name;
//	int mobile;
//	String address;
//	int date_in;
//	int date_out;
//	
//	hotel(int id, String name, int mobile, String address, int date_in, int date_out) {
//		this.id = id;
//		this.name = name;
//		this.mobile = mobile;
//		this.address = address;
//		this.date_in = date_in;
//		this.date_out = date_out;
//	}
//	public void display() {
//		System.out.println("Id: "+id);
//		System.out.println("Name: "+name);
//		System.out.println("Mobile number: "+mobile);
//		System.out.println("Address: "+address);
//		System.out.println("date_in: "+date_in);
//		System.out.println("date_out: "+date_out);
//	}
}

public class Hotel_management_System extends Thread{

	public static void main(String[] args) {
		login obj = new login();
		obj.run();
//		display obj1 = new display();
//		obj1.details(1234, "anirudh", 908765432, "Ongole");
//		obj1.details_display();
	
		
		
		// TODO Auto-generated method stub

	}

}
