package homeexercise;

public class B {
	
	String name;
	String email;
	
	public B(String x, String y) {
		name=x;
		email = y;
		
	}
	public boolean compare() {
		boolean z =name.equals(email);
		return z;
	}
			

	public static void main(String[] args) {
		B t = new B("raju", "rahim@");
		boolean f =t.compare();
		System.out.println(f);
		

	}

}
