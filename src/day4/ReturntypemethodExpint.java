package day4;

public class ReturntypemethodExpint {

	public static void main(String[] args) {
		int r ;
		r= (add(10,5) + add(2,3))*3 ;
		System.out.println(r);
		

	}
    public static int add(int x, int y) {
    	int z ;
    	z = x+y ;
    	return z ;
    	
    }
}
