import java.io.File;
import java.util.Scanner;

public class FileIO_Scanner {

	public static void main(String[] args) {
		
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
	}

}
