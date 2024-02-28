package upskillfalcon;

public class MethodExample {
	
	int x  ;
	
	
	static int y;
	static String name = "abcd123";

	public static void main(String[] args) {
		
		MethodExample obj = new MethodExample();
		MethodExample obj1 = new MethodExample();
		
		obj.add();
		obj.add1(20,39);
		boolean r = add2();

	
	
	
	
	}
	
	public void add() {
		
		int a;
		a=3;
		int b= 0;
		int c= a/b;
		System.out.println(c);
	

}
	public void add1(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
		
	}
	public static boolean add2() {
		int a = 10;
		int b = 20;
		boolean c= a>b;
		System.out.println(c);
        return c;
	}

}
