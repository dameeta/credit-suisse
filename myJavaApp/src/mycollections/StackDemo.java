package mycollections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> newstack=new Stack<Integer>();
		
		newstack.push(4);
		newstack.push(4);
		newstack.push(4);
		newstack.push(2);
		newstack.push(123232);
		newstack.push(123232);

	
	System.out.println(newstack);
	System.out.println(newstack.isEmpty());
	System.out.println(newstack.pop());
	System.out.println(newstack.pop());
	System.out.println(newstack);

	
	}

}
