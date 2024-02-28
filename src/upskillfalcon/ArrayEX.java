package upskillfalcon;

public class ArrayEX {

	public static void main(String[] args) {
		int [] x = { 20,30,35, 45,89 ,55,42,23,45,54,67}; //index 0 1 2 3 4 5 6
	int l = 	x.length;
	 
	
	ArrayEX obj = new ArrayEX();
		//last index number l
	//System.out.println(l);

	
//	for(int i = 0; i <=l-1; i = i+1  ) {
//		
//		System.out.println(x[i]);
//	}
	for (int i= l-1; i >=0 ; i = i-1) {
		System.out.println(x[i]);
	}
	try {
		System.out.println(x[20]);
		
} 
	catch (Exception e) {

		System.out.println("Test 20 failed, continiued to test 21 because of Array Index Out of Bounds, Please check array index");

		e.printStackTrace();

}
	
	


	
	
	
	

	}

}
