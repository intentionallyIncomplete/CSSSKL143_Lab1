/*Imports*/
import java.io.*;
import java.util.Scanner;

/* *
 * @author Ian Bryan
 * @version 1,0
 * */
public class Part1 {

	public static void main(String[] args) {
		
		Part1 p1 = new Part1();
		
		//Write a loop to print out the first 10 digits. Use a for() loop to accomplish this.
		for(int i=0;i<10;i++) {
			System.out.println("loop #" + i);
		}
		
		int j = 0;
		//Write a loop to print out the first 10 even digits
		//Use a while() loop to accomplish this and use an if (a % 2 == 0) to determine even or odd.
		while(j<20) {
			if(j % 2 == 0) {
				System.out.println("The number " + j + " is even");
				j++;
			}else {
				j++;
			}
		}
		
		/* Test scores used in this for testing we 68,99,72,81,88*/
		//Write a loop to sum the first 5 integer quiz scores entered by the console.
		//Use Scanner keys = new Scanner(System.in) for console input and use a sum variable.
		Scanner humanInput = new Scanner(System.in);
		System.out.println("Enter 5 consecutive quiz scores");
		int[] quizScores = new int[5];
		int scoresTotal = 0;
		for(int k=0;k<quizScores.length;k++) {
			quizScores[k] = humanInput.nextInt();
			scoresTotal += quizScores[k];
		}
		//Average the integers entered in the previous problem.
		//Produce a double result, as in 96.5.
		double quizAvg = (double)scoresTotal / quizScores.length;

		System.out.println("scoresTotal " + scoresTotal);
		System.out.println("quizAvg " + quizAvg);
		
		//Use an if statement to produce a letter grade {A,B,C,D,F}.
		//Grades over 90 should print "A", over 80 should print "B", etc.
		for(int k=0;k<quizScores.length;k++) {
			if(quizScores[k] <= 59) {
				System.out.println(quizScores[k] + " is an F");
			}
			else if(quizScores[k] <= 69 && quizScores[k] >= 60) {
				System.out.println(quizScores[k] + " is a D");
			}
			else if(quizScores[k] <= 79 && quizScores[k] >= 70) {
				System.out.println(quizScores[k] + " is a C");
			}
			else if(quizScores[k] <= 89 && quizScores[k] >= 80) {
				System.out.println(quizScores[k] + " is a B");
			}
			else if(quizScores[k] <= 99 && quizScores[k] >= 90) {
				System.out.println(quizScores[k] + " is an A");
			}
			else {
				System.out.print("Something went wrong");
			}
		}
		
		//Rewrite the if statement above using a switch statement.
		//Are there any problems with this?
		/*
		 * Switch statements are not able to operate on Arrays
		 * */
		
		humanInput.close();
	} //end main
	
}
