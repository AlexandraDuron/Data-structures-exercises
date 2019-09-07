import java.util.*;
import java.util.Stack;



public class Solution{
	//Atributes 
	String input;
	Stack<Character> stack = new Stack<Character>();

	//read file
	public String readFile(){
		
		String input = "{}";
		Scanner sc = new Scanner(input);
		while (sc.hasNext()) {
			this.input=sc.next();    
		}
		return this.input;
	}



	//Push and pop in stack
	public void checkSecuence(){
		Solution solution = new Solution();
		//Check for the first element
		
		if(solution.readFile().charAt(0) == 40 || solution.readFile().charAt(0) == 91 || solution.readFile().charAt(0) ==123)
		{
			stack.push(solution.readFile().charAt(0));
			System.out.println("The first character is a left element, I pushed it");
		}

		else if (solution.readFile().charAt(0) == 41 || solution.readFile().charAt(0) == 93 || solution.readFile().charAt(0) ==125)
		{System.out.println("Invalid secuence");}


		// push or pop
		for(int i=1; i<solution.readFile().length(); i++){
			if((stack.peek()==123 && solution.readFile().charAt(i)==125)||(stack.peek()==40&& solution.readFile().charAt(i)==41)||(stack.peek()==91 && solution.readFile().charAt(i)==93))

			{
				stack.pop();
				System.out.println("Pop");
			}

			else if(solution.readFile().charAt(i)==125 || solution.readFile().charAt(i)==41 || solution.readFile().charAt(i)==93)
			{
				stack.push(solution.readFile().charAt(i));
				System.out.println("I've pushed a left character");
			}

		}

		//Check of stack is empty
		if(stack.size()==0){
			System.out.print("True");
		}

		else {System.out.print("False");}

	}// Method check sequence ends

}  // Solution main class







