package day3;

public class DoublepipesExpint {

	public static void main(String[] args) {
		pps (6,3) ;
		pps (3,6) ;
		pps (6,6) ;
		

	}
   public static void pps(int x, int y) {
	   boolean z ;
	   z = (x>y) || (x<y) ;
	   System.out.println(z);
   }
}
