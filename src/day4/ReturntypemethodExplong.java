package day4;

public class ReturntypemethodExplong {
	static String city = "NEWYORK";

	public static void main(String[] args) {
		long r ;
		r = add(100l,200l) + add(25l,75l) ;
		System.out.println(r);
		System.out.println(city);
		

	}
   public static long add(long x, long y) {
	   long z;
	   z = x+y ;
	   System.out.println(city);
	   return z ;
	   
   }
}
