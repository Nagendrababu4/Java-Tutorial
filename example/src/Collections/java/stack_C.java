package Collections.java;

import java.util.Stack;

public class stack_C {

	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.push("Nag");
		obj.push(34);
		obj.push("anirudh");
		System.out.println(obj);
		
		System.out.println(obj.pop());
		System.out.println(obj.pop());

	}

}
