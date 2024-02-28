package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intex {

	public static void main(String[] args) {
		int []x;
		x = new int [6];
		x[0] = 10;
		x[1] = 25;
		x[2] = 30;
		x[3] = 45;
		x[4] = 55;
		x[5] = 63;
		x[6] = 20;
		
		
		
	int  l  = x.length ;
	      
	    
	List<Integer> list = Arrays.asList(100,34,12, 25, 38, 46);
		
	//Collections.sort(list);
	Collections.sort(list, Collections.reverseOrder());
			
		 System.out.println(list);
             
	}

}
