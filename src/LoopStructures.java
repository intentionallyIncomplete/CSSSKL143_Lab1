import java.util.Scanner;

public class LoopStructures {
	
	public static void main(String[] args) {

		Scanner sc2 = new Scanner(System.in);
		int product = 0;
		System.out.println("Enter a number to know its factorial...");
		product = sc2.nextInt();
		
		findFact(product);
	}//end main

	public static void findFact(int product) {
		int factorial = 1;
		for(int i=1;i<=product;i++) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of " + product + " is " + factorial);
	}
}