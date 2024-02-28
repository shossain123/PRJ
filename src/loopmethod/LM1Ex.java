package loopmethod;

public class LM1Ex {

	public static void main(String[] args) {
		add(20l);
		add(15l) ;
		

	}
	public static void add(long x) {
		for(long i=1; i<=x ; i=i+1 ) {
			System.out.println(i);
		}
	}

}
