package synchronization.java;
class block{

	int total_seats = 10;           //synchronization block
	public void tickets(int seats) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
		synchronized (this) {
			if (total_seats>seats) {
				System.out.println("Tickets booked "+seats);
				total_seats = total_seats-seats;
				System.out.println("remaining seats: "+total_seats);
			}
			else {
				System.out.println("not booked "+seats);
				System.out.println("seats left: "+total_seats);
			}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}  	
}
public class Sync_block extends Thread {
	
	static block t;
	int seats;
	public void run() {
		 t.tickets(seats);
	}
	public static void main(String[] args) {
        t = new block();
		
        Sync_block hari = new Sync_block();
		hari.seats = 8;
		hari.start();
		
		Sync_block ram = new Sync_block();
		ram.seats = 6;
		ram.start();
	}
}
