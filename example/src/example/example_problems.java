package example;



class ex {
	
	int total_seats = 10;
	public void wait(int seats) {
		if (total_seats>seats) {
			System.out.println("Tickets booked");
			total_seats = total_seats-seats;
			System.out.println("remaining seats: "+total_seats);
		}
		else {
			System.out.println("not booked "+seats);
			System.out.println("seats left: "+total_seats);
		}
		}
}

class example_problems extends Thread{
	
	int seats;
	static ex t;
	public void run() {
		
		t.wait(seats);
		
	}
	
	

	public static void main(String[] args) throws InterruptedException{
		
		t = new ex();
		
		example_problems ravi = new example_problems();
		ravi.seats = 5;
		ravi.start();
		
		example_problems vishnu = new example_problems();
		vishnu.seats = 5;
		ravi.start();
		
		
	}

}
