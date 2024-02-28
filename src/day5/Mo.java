package day5;

public class Mo {

	public static void main(String[] args) {
		Mo v = new Mo();
		int r ;
		r = v.modulus(40,30);
		System.out.println(r);
		boolean r1 ;
		
		r1 = v.greater(20, 10);
		System.out.println(r1);
		
		boolean r2;
		r2 = v.less(30, 33);
		System.out.println(r2);
		
		boolean r3;
		r3 = v.nteq(20, 10);
		System.out.println(r3);
		
		boolean r4 ;
		r4 = v.dblamp(20,14);
		System.out.println(r4);
		
		boolean r5 ;
		r5 = v.dblpp(30,10);
		System.out.println(r5);
		
		boolean r6 ;
		
	r6 = v.ngt(50, 20);
	System.out.println(r6);
		
		
		

	}
    public int modulus(int x, int y) {
    	int z ;
    	z = x%y ;
    	return z ;
    }
    	public boolean greater(int x, int y) {
    		boolean z;
    		z = x>y ;
    		return z ;
    		
    		
    		
    	}
    	public boolean less(int x, int y) {
    		boolean z ;
    		z = x<y ;
    		return z ;
    		
    	}
    	public boolean nteq(int x , int y) {
    		boolean z ;
    		z = x!=y ;
    		return z ;
    		
    	}
    	public boolean dblamp(int x, int y) {
    		boolean z ;
    		z = (x>y) && (x==y);
    		return z ;
    		
    	}
    	public boolean dblpp(int x, int y) {
    		boolean z ;
    		z = (x>y) || (x==y);
    		return z ;
    		
    	}
    	public boolean ngt(int x, int y) {
    		boolean z;
    		z = !(x<y);
    		return z ;
    		
    	}
    	
    
}
