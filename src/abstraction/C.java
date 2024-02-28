package abstraction;

public class C implements I{
	
	public void add(int x, int y) {
		
		
		System.out.println(x+y);
	}
	 public void multifly(int  c, int d) {
		 System.out.println(c*d);
	}
	public static void main(String[] args) {
		C t = new C();
		
		t.add(100, 50);
		t.multifly(2, 3);

	}
	
	

}
