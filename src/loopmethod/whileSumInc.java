package loopmethod;

public class whileSumInc {

	public static void main(String[] args) {
		sum(5);
		sum(6);
		sum(4);
		

	}
	public static void sum(int x) {
		int s;
		s =0 ;
		
		int i =1;
		while(i<=x) {
		
		s = s+i ;
		i =i+1;
		}
		System.out.println(s);
		
	}
	
	
	

}
