package synchronization.java;

class movie_tickets{
	
	int total_tickets = 20;
	public void Tickets(int tickets) {
		
		if (total_tickets>tickets) {
			System.out.println("tickets booked "+tickets);
			total_tickets = total_tickets-tickets;
			System.out.println("remaining tickets: "+total_tickets);	
		}
		else {
			System.out.println("tickets not booked: "+tickets);
			System.out.println("tickets left: "+total_tickets);
		}
	}
}
class Thread1 extends Thread{
	movie_tickets t;
	int tickets;
	public Thread1(movie_tickets t, int tickets) {
		this.t = t;
		this.tickets = tickets;
	}
	public void run() {
		t.Tickets(tickets);
	}
}
class Thread2 extends Thread{
	movie_tickets t;
	int tickets;
	public Thread2(movie_tickets t, int tickets) {
		this.t = t;
		this.tickets = tickets;
	}
	public void run() {
		t.Tickets(tickets);
	}
}
public class Sync_static {

	public static void main(String[] args) {
		movie_tickets obj = new movie_tickets();
		
		Thread1 a = new Thread1(obj, 5);
		a.start();
		
		Thread2 b = new Thread2(obj, 10);
		b.start();
	}
}
