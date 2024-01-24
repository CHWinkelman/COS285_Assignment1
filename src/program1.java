/**
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import accidentpack.Report;

/**
 * 
 */
public class program1 {

	public void queryReports(ArrayList<Report> reportArray) {
		
	}
	
	public void run(String fileName) {
		try (Scanner s = new Scanner(new FileReader(fileName))) {
			 
			if (!s.hasNext()) {
				System.err.println("File " + fileName + " is empty.");
				System.exit(3);
			}
			
			
		} catch (FileNotFoundException ex) {
			System.err.println("File not found");
			System.exit(2);
		}

	}
	
	/**
	 * Checks for a singular arg and passes it to run()
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: program1 fileName");
		}
		
		program1 driver = new program1();
		driver.run(args[0]);
	}
}
