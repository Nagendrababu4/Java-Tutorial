import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		
		int a = 1;		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		
		int i = 0;

		while(i<n) {
			if (i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
		

	}

}
