package loopmethod;

public class SumincEX {

	public static void main(String[] args) {
		sum(5);
		sum(4);
		sum(6);
		

	}
	public static void sum(int x) {
		int s;
		s =0;
		
		for(int i=1 ; i<=x ; i = i+1) {
			s = s+i;
			
			
		}
		System.out.println(s);
	}
    
}
