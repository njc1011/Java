
/* Prompt:
Given a string of round, curly, and square open and closing brackets, 
return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false.

*/

import java.util.*;
import java.io.*;

public class BalancedBrackets{
	public static void main(String[] args){

		String input;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		Stack stack = new Stack();

		System.out.println("\nInput String\n");
		input = scanner.nextLine();

		for(int i = 0; i < input.length(); i++)
		{
			char hold = input.charAt(i);

			if(hold == '(' || hold == '{' || hold == '[')
			{
				stack.push(hold);
			}
			else if((hold == ')' && (stack.peek().equals('(') == false || stack.empty() == true)) ||
				    (hold == '}' && (stack.peek().equals('{') == false || stack.empty() == true)) ||
				    (hold == ']' && (stack.peek().equals('[') == false || stack.empty() == true)))
			{
				result = "False";
			}
			else
				stack.pop();

		}

		if(stack.empty() == true)
			result = "True";

		System.out.println("\nResult: " + result);


	}
}