import java.util.Scanner;

public class SelectionControlStructures {

	public static void main(String[] args) {
		
		//New Scanner object for user input
		Scanner sc3 = new Scanner(System.in);
		
		int userInputN = 0;
		
		System.out.println("Enter an integer to find its divisors");
		userInputN = sc3.nextInt();
		
		if(userInputN <=0 || userInputN == 1) {
			System.out.println("Please enter and positive integer greater than 1");
		}else if(userInputN > 1) {
			for(int i=userInputN-1;i>1;i--) {
				if(userInputN % i == 0) {
					System.out.println(i + " is a divisor");
				}
			}
		}
	}//end main
	
}
