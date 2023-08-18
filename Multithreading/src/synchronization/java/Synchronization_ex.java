package synchronization.java;

class app{
	int total_seats = 10;  // with synchronization method
	public synchronized void tickets(int seats) {
		
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
		
}
	class Synchronization_ex extends Thread{
		static app t;
		
		int seats;
		public void run() {
			
			 t.tickets(seats);
		}

	public static void main(String[] args) {
		
		t = new app();
		Synchronization_ex hari = new Synchronization_ex();
		hari.seats = 8;
		hari.start();
		
		Synchronization_ex ram = new Synchronization_ex();
		ram.seats = 6;
		ram.start();
		
		}
}
