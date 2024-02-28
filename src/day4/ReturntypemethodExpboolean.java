package day4;

public class ReturntypemethodExpboolean {

	public static void main(String[] args) {
		boolean r ;
		r= eq(10,10) ;
		
		System.out.println(r);
		boolean r1 ;
		
		r1 = eq(20,10) ;
		System.out.println(r1);

	}
    public static boolean eq(int x, int y) {
    	boolean z ;
    	z = x==y ;
    	return z ;
    	
    }
}
