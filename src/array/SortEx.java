package array;

public class SortEx {

	public static void main(String[] args) {
		 
		int[] a = { 22, 11, 7 , 35, 9, 45, 7,55};
		int temp;
		 int l = a.length;
		 for(int i =0; i<l ; i=i+1) {
			 for(int j= i+1; j<l; j++) {
				 if(a[i]<a[j]) {
					 temp = a[i];
					 a[i]= a[j];
					 a[j]= temp;
					 
							 
							 
					 
				 }
			 }
		 }
		 System.out.println(a[1]);
		 for(int i=0; i<l; i++) {
			 System.out.println(a[i]);
		 }
    
    	
	}

}
