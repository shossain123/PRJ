package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binaryfile1 {

	public static void main(String[] args) throws IOException {
		String fileRead = "data/p1.JPG";
		String fileWrite = "data/p2.JPG";
		FileInputStream fis = new FileInputStream (fileRead);
		FileOutputStream fos = new FileOutputStream(fileWrite);
		
		int i = fis.read();
		while(i != -1) {
			byte b = (byte) i;
			fos.write(b);
			
			i = fis.read();
			
		}
		fis.close();
		fos.close();
		
		

	}

}
