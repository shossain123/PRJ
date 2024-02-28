package day5;

public class M {

	public static void main(String[] args) {
		M p = new M();
		int r ;
		int r1 ;
		int n ;
		
		
		r = p.multify(25, 20);
		System.out.println(r);
		r = p.multify(15, 10) ;
		System.out.println(r);
		r1 = p.multify(10, 5) ;
		System.out.println(r1);
		
		n = p.add(65,25) ;
		System.out.println(n);

	}
    public int multify(int x, int y) {
    	int z ;
    	z = x*y ;
    	return z ;
    	
    }
    public int add(int x, int y) {
    	int z ;
    	z= x+y ;
    	return z ;
    	
    }
}
