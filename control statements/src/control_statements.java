
import java.util.Scanner;

public class control_statements {
	
	
	public static void main(String[] args) {
		
		Scanner word = new Scanner(System.in);
		System.out.println("enter a first number: ");
		int num1 = word.nextInt();
		
		System.out.println("enter second number");
		int num2 = word.nextInt();
		
		System.out.println("enter third number");
		int num3 = word.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("num1 is greater");
		}
		else if (num2>num1 && num2>num3) {
			System.out.println("num2 is greater");
		}
		else if (num3>num1 && num3>num2) {
			System.out.println("num3 is greater");
		}
		else {
			System.out.println("three of them are same");
		}
		

	}

}