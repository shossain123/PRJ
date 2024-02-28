package loopmethod;

public class SumdecEx {

	public static void main(String[] args) {
		sum(5);
		sum(6);
		sum(4);
		

	}
	public static void sum(int x) {
		int s;
		s =0;
		
		for(int i=10; i>=x; i=i-1) {
			s =s+i;
			
			
		}
		System.out.println(s);
	}

}
