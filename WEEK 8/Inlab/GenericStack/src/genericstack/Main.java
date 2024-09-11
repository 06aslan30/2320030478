package genericstack;

public class Main {

	public static void main(String[] args) {
		 Stack<Integer> intStack = new LinkedListStack<>();
	        intStack.push(45);
	        intStack.push(92);
	        System.out.println("Integer LinkedListStack:");
	        System.out.println("Peek: " + intStack.peek()); 
	        System.out.println("Pop: " + intStack.pop()); 
	        System.out.println("IsEmpty: " + intStack.isEmpty()); 

	        Stack<String> stringStack = new ArrayStack<>(2);
	        stringStack.push("dog");
	        stringStack.push("bear");
	        System.out.println("\nString ArrayStack:");
	        System.out.println("Peek: " + stringStack.peek()); 
	        System.out.println("Pop: " + stringStack.pop()); 
	        System.out.println("IsEmpty: " + stringStack.isEmpty());
	    }

}
