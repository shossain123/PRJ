package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class A1 {

	public static void main(String[] args) throws IOException {
		for(int i =0; i<2 ; i++) {
		
		String file = "data/samplep"+i+".txt";
		
		FileWriter fw = new FileWriter (file);
		
		fw.write("i am a good student");
		fw.close();
		}

	}

}
