package filehandling;


import java.io.FileReader;
import java.io.IOException;

public class B1 {

	public static void main(String[] args) throws IOException {
		String file = "data/sample10.txt";
		
		FileReader fr = new FileReader (file);
		
		for (int i = fr.read(); i != -1; i = fr.read()) {
			char c = (char) i;
			System.out.print(c);
			
		}
		fr.close();
		
			

	}

}
