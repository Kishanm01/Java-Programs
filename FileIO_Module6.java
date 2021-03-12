// Kishan Mistry
package assignments;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class FileIO_Module6 {

	public static void main(String args[]) //throws IOException
	{
		/*
		 * Instantiate File object of the original file.
		 */
		File textFile = new File(/*Path of Original File */"C://Users//kisha//Desktop//TextFiles//textfile.txt");

		/*
		 * Reading the Names of original and new files.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the original file and the new file: ");
		String origFName = scan.next();
		String newFName = scan.next();

		/*
		 * Check if the original file exist and can be read.
		 */
		File ifExistFile = new File(textFile.getParentFile().getAbsolutePath() + "/" + origFName);
		try {
			if (ifExistFile == null || !ifExistFile.canRead())
				throw new FileNotFoundException("The original file does not exist or is Non-Readable!");
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter another file name or 'exit' to abort program");
			origFName = scan.next();
			if (origFName.equalsIgnoreCase("exit"))
				System.exit(1);
			ifExistFile = new File(textFile.getParentFile().getAbsolutePath() + "/" + origFName);
		}
		
		/*
		 * Check if the new file name already exist.
		 */
		File newFile = new File(textFile.getParentFile().getAbsolutePath() + "/" + newFName);
		try {
			if (newFile.exists())
				throw new FileAlreadyExistsException("The new file name already exist!");
		}
		catch (FileAlreadyExistsException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter 'true' to overwrite existing file or Enter new file name.");
			if (scan.hasNextBoolean() == false)
				newFName = scan.next();
			newFile = new File(textFile.getParentFile().getAbsolutePath() + "/" + newFName);
		}
		finally {
			scan.close();
		}
		
		try (BufferedReader BR = new BufferedReader(new FileReader(ifExistFile));
				BufferedWriter BW = new BufferedWriter(new FileWriter(newFile));)
		{
			String line;
			while ((line = BR.readLine()) != null)
			{
				BW.write(line);
				BW.newLine();
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("The original file name: " + origFName);
		System.out.println("The new file name: " + newFName);
	}
}