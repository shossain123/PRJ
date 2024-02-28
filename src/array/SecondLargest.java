package array;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int []a = {66,10,6,66,45,7,49,20};
		
		int max;
		max = a[0];
		int second =a[1];
		int l = a.length ;
		for(int i=1; i<l; i=i+1) {
			
			if(max<a[i]) {
				second = max;
				max = a[i];
				
			}
			else if(a[i]>second && a[i] !=max) {
				second =a[i];
				
				
			}
			
		}
		System.out.println(max);
		System.out.println(second);


	}

}
