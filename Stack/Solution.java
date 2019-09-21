
/**************************************************************** 
 * This class pops and pushes elements into the stack, and check if the stack is empty
 * 
I have utilized the ASCII to check for the symbols.

( = 40
) = 41
[ = 91
] = 93
{ = 123
} = 125
 *   
 * **************************************************************/
import java.util.*;
import java.util.Stack;



public class Solution{
	//Atributes 
	String input;
	Stack<Character> stack = new Stack<Character>();

	//Read a String
	public String readFile(){

		String input = "({()})";
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
		stack.push(solution.readFile().charAt(0));
		System.out.println("I have pushed the first element");
		
		// push or pop
		for(int i=1; i<solution.readFile().length(); i++){

			// check if the stack is empty. If so, add the next element in the string

			if((stack.size()==0) && (solution.readFile().charAt(i)==125||solution.readFile().charAt(i)==123 || solution.readFile().charAt(i)==40 || solution.readFile().charAt(i)==41 || solution.readFile().charAt(i)==91 || solution.readFile().charAt(i)==93 ) ){
				stack.push(solution.readFile().charAt(i));
				System.out.println("I've pushed a character");
			}


			else if((stack.peek()==123 && solution.readFile().charAt(i)==125)||(stack.peek()==40&& solution.readFile().charAt(i)==41)||(stack.peek()==91 && solution.readFile().charAt(i)==93))

			{
				stack.pop();
				System.out.println("Pop");
			}

			else if(solution.readFile().charAt(i)==123 || solution.readFile().charAt(i)==40 || solution.readFile().charAt(i)==91)
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

	}

}  