package exercise;

public class SumprintEx {

	public static void main(String[] args) {
		
		int s;
		s = 0 ;
		
		for(int i=0; i<=20 ; i=i+1) {
			
			if (i<=10) {
				s = s+i ;
				
				
			}
			else if(i>=11) {
				System.out.println(i);
				
				
			}
		}
		System.out.println(s);
		

	}

}
