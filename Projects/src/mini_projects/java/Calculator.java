package mini_projects.java;

import java.util.Scanner;

public class Calculator {
	int a;
	int b;

	public void addition() {

		int c = a + b;
		System.out.println("addition: " + c);
	}

	public void subtraction() {

		int c = a - b;
		System.out.println("Subtraction: " + c);
	}

	public void multiplication() {

		int c = a * b;
		System.out.println("multiplication: " + c);
	}

	public void division() {
		int c = a / b;
		System.out.println("division: " + c);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		
		System.out.println("Welcome to the Calculator...");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		boolean quit = false;

		while (!quit) {
			System.out.println("enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				obj.addition();
				break;
			case 2:
				obj.subtraction();
				break;
			case 3:
				obj.multiplication();
				break;
			case 4:
				obj.division();
				break;
			case 5:
				quit = true;
				break;
			}
		}
	}
}
