package homeexercise;

public class MaxEx {

	public static void main(String[] args) {
		int []a = {10,6,45,7,49,20};
		
		int max;
		max = a[0];
		int min = a[0];
		int l = a.length ;
		for(int i=1; i<l; i=i+1) {
			
			if(max<a[i]) {
				max = a[i];
				
			}
			else if(min>a[i]) {
				min = a[i];
				
			}
			
		}
		System.out.println(max);
		System.out.println(min);

	}

}
