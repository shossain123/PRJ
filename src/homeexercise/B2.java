package homeexercise;

public class B2 {
	//Write an instance method that can test
	//those two instance variables are equal or not
	
	int id;
	int ph;
	
	public B2(int x, int y) {
		id =x;
		ph = y;
		
	}
	public boolean compare() {
		boolean z = id==ph;
		return z;
	}
			

	public static void main(String[] args) {
		B2 t = new B2(100,100 );
		boolean f =t.compare();
		System.out.println(f);
		

	}

}
