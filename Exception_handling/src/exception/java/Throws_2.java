package exception.java;

import java.io.IOException;

public class Throws_2 {
	
	public static void ticket(int waiting_list) throws IOException{
		if (waiting_list>=20) {
			throw new IOException("you don't have chance to book ticket");
		}
		else {
			System.out.println("you have chances to book ticket");
		}
	}

	public static void main(String[] args) {
		try {
			ticket(30);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
