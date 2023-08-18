package synchronization.java;

import java.util.Scanner;
class kart{
	
	int mobile_cost = 20000;
	int hdfc_offer = 2000;
	int sbi_offer = 1500;
	int Emi = 2000;
	public synchronized void mobile(int customer_cost) {
		
		try {
		
			if (mobile_cost>customer_cost) {
			
				System.out.println("please check your offers....");
				Scanner a =new Scanner(System.in);
				System.out.println("enter your choice: ");
				
				int ch = a.nextInt();
				
				
				switch (ch) {
				case 1:
					System.out.println("Bank offer: "+ hdfc_offer);
					mobile_cost = mobile_cost-hdfc_offer;
					mobile_cost = mobile_cost - customer_cost;
					System.out.println("mobile_cost with hdfc_offer: "+ mobile_cost);
					break;
				case 2:
					System.out.println("Bank offer: "+ sbi_offer);
					mobile_cost = mobile_cost-sbi_offer;
					mobile_cost = mobile_cost - customer_cost;
					System.out.println("mobile_cost with sbi_offer: "+ mobile_cost);
					break;
				case 3:
					System.out.println("Bank offer: "+ Emi);
					mobile_cost = mobile_cost-Emi;
					mobile_cost = mobile_cost - customer_cost;
					System.out.println("mobile_cost with Emi offer : "+ mobile_cost);
					break;
				case 4:
					System.out.println("cash on delivery");	
					System.out.println("you have to pay: "+mobile_cost);	
					
					break;
				}
			}
			else {
				System.out.println("please choose price range: "+ mobile_cost);
			}
			Thread.sleep(1000);
				
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}
public class Sync_ex extends Thread{
	
	kart e;
	int customer_cost;
	
	public Sync_ex(kart e, int customer_cost) {
		this.e = e;
		this.customer_cost = customer_cost;
	}
	
	public void run() {
		e.mobile(customer_cost);
	}

	public static void main(String[] args) {
		kart e = new kart();
		
		Sync_ex obj1 = new Sync_ex(e, 10000);
		obj1.start();
		
		Sync_ex obj2 = new Sync_ex(e,10000);
		obj2.start();
		

	}

}
