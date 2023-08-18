package bank.java;

import java.util.Scanner;
class bank{
	
	private int existing_ac_num = 9001;
	private int amount = 1000;
	
	void login() {
		System.out.println("login details........"+'\n');
		Scanner word = new Scanner(System.in);
		System.out.println("enter ac_num: ");
		int ac_num = word.nextInt();
		if (existing_ac_num == ac_num) {
			System.out.println("login successfully");
		}
		else if (ac_num != existing_ac_num){
			System.out.println("please check your login details");
		}
	}
	void customer_details() {
		System.out.println("account details........"+'\n');
		Scanner word = new Scanner(System.in);
		System.out.println("enter name: ");
		String name = word.nextLine();
		System.out.println("enter age: ");
		int age = word.nextInt();
		System.out.println("enter mobile_num: ");
		Long mobile_num = word.nextLong();
		System.out.println("existing amount: " + amount);
	}
	void deposit() {
		System.out.println("enter the deposit amount: ");
		Scanner word = new Scanner(System.in);
		int deposit_amount = word.nextInt();
		amount = amount + deposit_amount;
		System.out.println("Total money after deposited: "+ amount);
	}
	void withdraw() {
		System.out.println("enter the withdraw amount: ");
		Scanner word = new Scanner(System.in);
		int withdraw_amount = word.nextInt();
		amount = amount - withdraw_amount;
		System.out.println("Total money after withdraw: "+ amount);
	}
	void display() {
		System.out.println("Total amount in your bank account: "+ amount);
	}
}
public class Bank_statement {

	public static void main(String[] args) {
		
		Scanner word = new Scanner(System.in);
		bank obj = new bank();
		obj.login();
		System.out.println('\n' + "......Welcome to the ABC Bank........" + '\n');
		System.out.println("1.Customer details");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Display");
		System.out.println("5.Exit");
		boolean quit = false;
		
		while (! quit) {
			System.out.println("enter your choice: ");
			int choice = word.nextInt();
			
			switch(choice) {
			    case 1: 
			    	obj.customer_details();
			    	break;
			    case 2:
			    	obj.deposit();
			    	break;
			    case 3:
			    	obj.withdraw();
			    	break;
			    case 4:
			    	obj.display();
			    	break;
			    case 5:
			    	quit = true;
			    	break;
			}
		}
		
//		do {
//			System.out.println("enter your choice: ");
//			int choice = word.nextInt();
//			
//			switch(choice) {
//			    case 1:
//			    	obj.login();
//			    	break;
//			    case 2:
//			    	obj.deposit();
//			    	break;
//			    case 3:
//			    	obj.withdraw();
//			    	break;
//			    case 4:
//			    	obj.display();
//			    	break;
//			    case 5:
//			    	quit = true;
//			    	break;
//			}
//			
//		}while (! quit);
//
//
	}


}
