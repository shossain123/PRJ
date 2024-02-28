package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws IOException {
		//String file = "data/sample.txt";
	//	FileWriter fw = new FileWriter (file);
		
	//	fw.write("This is my sample file");
		//fw.close();
		String file = "data/sample11.txt";
		FileWriter fw = new FileWriter(file);
		fw.write("i love to work with you");
		fw.close();
		
		

	}

}
