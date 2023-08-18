package collections.java;

import java.util.Stack;

public class D_Stack_c {

	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.push(10);
		obj.push("Rishika");
		obj.push("college");
		obj.push(null);
		
		System.out.println(obj);
		
		System.out.println(obj.pop());
		
		System.out.println(obj.peek());
		
		System.out.println(obj.search("Rishika"));
		
		System.out.println(obj.empty());

	}

}
