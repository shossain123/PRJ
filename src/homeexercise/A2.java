package homeexercise;

public class A2 {
	//A class contains  three integer variables like start, end, count.
	// It has also a method which will print from start to end number.
	//The sequence of number will depends on count variable.
	static int start = 5;
	static int end = 30;
	static int count = 3;

	//public A2(int x, int y, int c) {
	//	start = x;
	//	end = y;
	//	count = c;
	//}

	public static void show() {
		for (int i = start; i <= end; i=i+count) {
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		//A2 t = new A2(5, 30, 3);
		show();
		
	}

}
