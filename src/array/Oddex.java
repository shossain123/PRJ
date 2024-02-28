package array;

public class Oddex {

	public static void main(String[] args) {
		int[]x= {10,20,30,45,55,60} ;
		
		int l = x.length  ;
		int s;
		s = 0 ;
		
		
		for (int i=0; i<l ; i =i+1) {
			// if (x[i]%2 ==1){
			if(i%2 ==1) {
				
				s = s+ x[i];
				
			}
			
			
		}
		System.out.println(s);
		

	}

}
