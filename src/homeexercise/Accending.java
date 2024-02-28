package homeexercise;

public class Accending {

	public static void main(String[] args) {
		int []a= {8,2,17,5,9,5,8};
		
		int l = a.length ;
		
		for(int i=0; i<l; i=i+1) {
			
			for(int j=i+1; j<l;j=j+1) {
				
//				if(a[i]<=a[j]) {
//					
//					int temp= a[i];
//					a[i]=a[j];
//					a[j] = temp;
//				}
			 if(a[i]==a[j]) {
					System.out.println("duplicate element is"  +a[i]);
					//break;
					
				}
				
			}
			//System.out.println(a[i]);
		}
		
		
		for(int i=0;i<l;i++) {
			System.out.println(a[i]);
		}
		

	}

}
