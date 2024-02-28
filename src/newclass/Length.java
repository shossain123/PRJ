package newclass;

public class Length {

	public static void main(String[] args) {
		String s = new String("we are learning jaba");
		indx('l');
		indx('b');
		
		int x ;
		x = s.length();
		System.out.println(x);
		
		char a;
		a = s.charAt(3);
		System.out.println(a);
		
		String r;
		r = s.substring(7);
		System.out.println(r);
		
		String d;
		d = s.substring(7,15);
		System.out.println(d);
		int k =total();
		System.out.println(k);
		
//	for(int i=0; i<s.length()-1; i++) {
//		if((s.charAt(i) ==' ')&&(s.charAt(i+1)!=' ')) {
//			
//			String word = s.substring(0,i);
//			System.out.println(word);
//					
//			
//		}
//	}
	
	

	}
	public static int total() {
		String s = new String("we are learning jaba");
		int x ;
		x = s.length();
		//System.out.println(x);
		return x;
	}
	public static void indx(char a) {
		String s = new String("we are learning jaba");
	int r=	s.indexOf(a);
	System.out.println(r);
	}

}
