import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/* *
 * @author Ian Bryan
 * @version 1.0
 * 
 * This 
 */

public class part2 {

	static int totalOfNums = 0;
	static double avgOfNums = 0.0;
	
	public static void main(String[] args) {

		part2 p2 = new part2();
		
		/*Arrays & File IO*/
		
		//hard-coded array
		int[] exNumbers = {68,99,72,81,88};
		
		//filename used to represent the name of the file with the printed data
		String filename = "workWithArray.txt";
		PrintWriter dataToFile = null;
		try {
			//PrintWriter object declared here with String argument
			dataToFile = new PrintWriter(new FileOutputStream(filename));
			for(int z=0;z<exNumbers.length;z++) {
				dataToFile.print(exNumbers[z] + ",");
			}
			
			sumNumbers(exNumbers);
			dataToFile.println();
			dataToFile.println(totalOfNums); //writing total of array indices to file on new line
			dataToFile.println(avgOfNums); //writing average of array indices to file on new line
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter a value to find the index \nof it in the array...");
			int numToFind = sc1.nextInt();
			p2.findElement(exNumbers, numToFind);
			sc1.close();
			
			p2.sumOnlyPositives(exNumbers);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (dataToFile != null) {
				dataToFile.close();
            }
        }
		
		/*Printing everything from the file to the console*/
		try {
			File readFrom = new File("P:/Users/HumanOutput/workspace/CSSSKL143_Lab1/workWithArray.txt");

            Scanner inputFile = new Scanner(readFrom);
            
            while (inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                System.out.println(line);
            }
            inputFile.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
	}//end main
	
	/*
	 * Write a new method or main and declare an array of integers
	 * Write a separate function to sum the contents of an array
	 * Find the average of the function above.
	 * Write a function to find the index of a specified element.
	 * Write a function to sum up only positive integers in an array.
	 * Write a function to populate an int array with values obtained from the console.
	 * */
	public static int sumNumbers(int[] exNumbers) {
		for(int a=0;a<exNumbers.length;a++) {	
			totalOfNums += exNumbers[a];
		}
		avgOfNums = (double)totalOfNums / exNumbers.length;
		return totalOfNums;
	}
	
	public void findElement(int[] exNumbers, int numToFind) {
		for(int c=0;c<exNumbers.length;c++) {
			if(numToFind == exNumbers[c]) {
				System.out.println(exNumbers[c] + " is at pos: " + c);
			}
		}
	}
	
	public void sumOnlyPositives(int[] exNumbers) {
		int positiveTotal = 0;
		for(int d=0;d<exNumbers.length;d++) {
			if(exNumbers[d] % 2 == 0) {
				positiveTotal += exNumbers[d];
			}
		}
		System.out.println("positiveTotal = " + positiveTotal);
	}
}
