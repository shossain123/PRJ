package homeexercise;

public class A {
	int start;
	int end;
	int count;

	public A(int x, int y, int c) {
		start = x;
		end = y;
		count = c;
	}

	public void show() {
		for (int i = start; i <= end; i=i+count) {
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		A t = new A(5, 30, 3);
		t.show();
		
		try {

			int num = Integer.parseInt("Rasel");

			System.out.println("Value of num int = " + num);

	} catch (NumberFormatException e) {

			System.out.println("Number format execption, Please make sure input string is a number");

			//e.printStackTrace();

	}

	}
	
	

}
