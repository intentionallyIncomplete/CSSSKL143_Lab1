package infix_Calculator;

import java.util.Scanner;
/*
 * InFixCalc, V0.0 (concept borrowed from Carol Zander's Infix Calculator)
 * Exercise author: Rob Nash
 * Complete the calculate() function below to build a simple, infix
 * calculator that evaluates a compound expression from left to right,
 * regardless of operator precedence
 *
 * Example: " 1 * -3 + 6 / 3"
 * Execution: calculate 1 * -3 first, then -3 + 6 next, then 3 / 3
 * last to obtain the value 1
 *
 * Solution by Ian Bryan
 */
public class InfixCalc {
	//example pattern: "3 + 5"
	//general pattern: <lhs='3'> <operation='+'> <rhs='5'> //extended pattern:     ...  
	//special case: 
	//other special cases?

	public static void main(String[] args) { //String input = "4 + 4";
		//String input = "4 + 4 / 2";
		//String input ="1 * -3";
		String input ="1 * -3 + 6 / 3";
		//String input ="5";
		//String input ="-5";
		int answer = calculate(input);
		System.out.println("Answer is " + answer);
	}

	//preconditions: all binary operations are separated via a space
	//postconditions: returns the result of the processed string
	public static int calculate(String input) {

		/*
		 * @author Ian Bryan
		 * left and right sides are set to the #'s on the left
		 * and right side of the operand respectively
		 * */
		int lhs = 0,rhs; //short for left-hand & right-hand side
		char operation;

		//Declare new Scanner object and pass in the String 'input' as
		//an argument for parsing.
		Scanner sc4 = new Scanner(input);
		//left side of operand is the same as the 'first' integer
		lhs = sc4.nextInt();
		//Using a boolean to make sure there is more of a line to read
		//if this returns fase (end of the input) the final result 
		//obtained is returned
		while(sc4.hasNext()) {
			//The operand is the next character in the line and converted
			//from a String object by finding the character at the
			//0th position in the String.
			operation = sc4.next().charAt(0);
			rhs=sc4.nextInt();
			//Each time an operand is found, set the upcoming left side of the 
			//equation to the result of the current pair's answer.
			switch(operation) {
			case '+': lhs= lhs + rhs;
			break;

			case '-': lhs= lhs - rhs;
			break;

			case '*': lhs= lhs * rhs;
			break;

			case '/': lhs= lhs/rhs;
			break;
			}
		}
		//Finally, return the result of what was processed
		//last according to the operand and the latest
		//left-hand side of the equation
		return lhs;
	}
}
