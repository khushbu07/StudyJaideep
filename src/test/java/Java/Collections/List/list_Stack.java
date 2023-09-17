package Java.Collections.List;

import java.util.Iterator;
import java.util.Stack;

public class list_Stack {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();  
		stack.push("Jaideep");  											// push
		stack.push("Yogesh");  			
		stack.push("Raghav");  
		stack.push("Makhan");  
		stack.push("Motta");  
		System.out.println("Printing Stack: " + stack);
		System.out.println("Printing size of Stack: " + stack.size());		// size
		
		System.out.println("Performing: Pop");
		stack.pop();  														// pop
		System.out.println("Printing Stack: " + stack);
		System.out.println("Printing size of Stack: " + stack.size());		// size
		
		System.out.println("Performing: Peek");
		System.out.println(stack.peek());
		
		System.out.println("Using Iterator");
		Iterator<String> itr=stack.iterator();								//Iterator 	 
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		
		Stack<Character> myStackTwo = new Stack<Character>();			//Character Stack
		myStackTwo.add('K');
		myStackTwo.add('X');
		myStackTwo.add('U');
		myStackTwo.add('N');
		
		System.out.println(myStackTwo.contains('J'));					//contains
		System.out.println(myStackTwo.empty());							//empty
		System.out.println(myStackTwo.get(2));							//get
		
		System.out.println(myStackTwo.set(0, 'S'));						//set
		System.out.println(myStackTwo);
		System.out.println(myStackTwo.size());							//size
		
	}  

}
