
import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
			System.out.println(sum);
			
//			if (i%2==0) {
//				System.out.println(i);
//			}
		}
		// TODO Auto-generated method stub

	}

}
