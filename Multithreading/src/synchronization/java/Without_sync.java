package synchronization.java;

class Table{                        //without synchronization method
	public void printtable(int n) {
		
		for (int i=1; i<=5; i++) {
			System.out.println(n*i);
		}
	}
}
class Thread_1 extends Thread{
	Table t;
	Thread_1(Table t){
		this.t = t;
	}
	public void run() {
		t.printtable(5);
	}
}

class Thread_2 extends Thread{
	Table t;
	Thread_2(Table t){
		this.t = t;
	}
	public void run() {
		t.printtable(100);
	}
}
public class Without_sync {

	public static void main(String[] args) {
		Table obj = new Table();
		
		Thread_1 t1 = new Thread_1(obj);
		
		Thread_2 t2 = new Thread_2(obj);
		t1.start();
		t2.start();
	}
}
