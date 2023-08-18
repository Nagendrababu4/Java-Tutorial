
import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		int i = 1;
		do {
			if (i%2==0) {
				System.out.println(i+" "+ "even numbers");
			}
			else {
				System.out.println(i+" "+ "odd numbers");
			}
			i++;
		}
		while(i<=n);

	}

}
