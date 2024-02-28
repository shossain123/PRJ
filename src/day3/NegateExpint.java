package day3;

public class NegateExpint {

	public static void main(String[] args) {
		ngt (9,3) ;
		ngt (4,6) ;
		ngt (3,9) ;
		

	}
   public static void ngt(int x, int y) {
	   boolean z ;
	   z = !((x>y) || (x<y)) ;
	   System.out.println(z);
   }
}
