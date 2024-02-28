package exercise;

public class Oddsum {

	public static void main(String[] args) {
		int []x = {10,21,33,43,44,11} ;
		
		int l = x.length  ;
		int s;
		s = 0;
		for(int i=0; i<l ; i=i+1) {
			
		if ((x[i]%2 ==1) && (i %2 ==1))	{
		
			s = s + x[i] ;
			
					
		}	
		}
		System.out.println(s);
		
	

	}

}
