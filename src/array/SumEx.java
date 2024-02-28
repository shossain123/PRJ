package array;

public class SumEx {

	public static void main(String[] args) {
		int [] x;
		x = new int [3];
		x[0] = 10 ;
		x[1] =20 ;
		x[2] = 30 ;
		// int[]x= {10,20,30} ;
		
		
		int l = x.length  ;
		int s;
		s = 0 ;
		for (int i=0; i<l ;i =i+1) {
			s = s+ x[i];
			
		}
		System.out.println(s);

	}

}
