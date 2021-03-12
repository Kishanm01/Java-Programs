package assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

//public class Test1 {
//	
//	public static void main (String[] args) {
//		
//		File test1 = new File("Assignments");
//		test1.mkdir();
//		System.out.println(test1.getAbsolutePath());
//		//test1 = new File("./Hello.txt");
//		System.out.println(test1.isDirectory() + "" + test1.isFile());
//		System.out.println(test1.getAbsolutePath());
//		File[] files = test1.listFiles();
//		for(File element : files)
//		{
//			System.out.println(element.getName());
//		}
//	}
//}
public class Test1 {
	  public static void main(String[] args) {
	    File file = new File("C:\\Users\\kisha\\Desktop\\TextFiles\\alice.txt");
	    BufferedReader BR = null;
	    BufferedWriter BW = null;
	    String content = "";
	    try {
	    	if(!file.exists())
	    		throw new Exception("File does not exist");
	    	String line;
	    	BR = new BufferedReader(new FileReader(file));
	    	while((line = BR.readLine()) != null) {
	    		System.out.println(line);
	    		content += line;
	    	}
	    	BR.close();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    String input = "Hello \n" + content;
	    try {
	    	BW = new BufferedWriter(new FileWriter(file));
	    	BW.write(input);
	    	BW.close();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    BufferedReader buffReader;
	    try {
	    	buffReader = new BufferedReader(new FileReader(file));
	    	String ln;
	    	while((ln = buffReader.readLine()) != null) {
	    		System.out.println(ln);
	    	}
	    	buffReader.close();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    
	}
}
