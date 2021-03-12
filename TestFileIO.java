package assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class TestFileIO {

	public static void main(String[] args) throws Exception{
		
		char[] hex16 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F'};
		int ans2 = 42;
		int ans1 = ans2 % 16;
		char hex = hex16[ans1];
		System.out.println(hex);
	}

}
