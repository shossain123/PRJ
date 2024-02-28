package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile2 {

	public static void main(String[] args) throws IOException {
	 String fileread = "data/p1.png";
	 String filewrite = "data/p2.png";
	 
	 FileInputStream fis = new FileInputStream (fileread);
	 FileOutputStream fos = new FileOutputStream (filewrite);
	 
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
