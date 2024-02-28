package abstraction;

public class B extends A {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void multifly(int x, int y) {
		System.out.println(x*y);
	}
	
	public static void main(String[] args) {
		B t = new B();
		
		t.add(100, 50);
		t.multifly(2, 3);

	}

}
