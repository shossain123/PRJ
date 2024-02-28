package array;

public class MoveZero {

	public static void main(String[] args) {
		int []a= {5,0,7,9,0,0,2,0,22,0};
		int l= a.length;
		int temp;
		int count = 0;
		for(int i =0; i<l; i++) {
			for(int j=i+1; j<l; j++) {
			if(a[j]==0 && a[i]!=0)
				//if(a[i]==0)
			{
				temp = a[i];
				a[i]=a[j];
				a[j]= temp;
				continue;
				
				}
			}
			
			
		}
		 
		 for(int i=0; i<l; i++) {
			 System.out.println(a[i]);
		 }
		

	}

}
