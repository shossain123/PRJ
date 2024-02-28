package newclass;

public class Student {

	public static void main(String[] args) {
		
		String x = new String("we are new student");
		      int l;
		     l = x.length();
		     System.out.println(l);
		   
		     char a;
		     a = x. charAt(5);
		     System.out.println(a);
		     
		 int f =x.indexOf("n");
		 System.out.println(f);
		     
		     String m;
		     
		   m = x.substring(7);
		   System.out.println(m);
		   
		   String r;
		   r = x.substring(7,15);
		   System.out.println(r);
		
		boolean b;
		
		b = x.equals(m);
		System.out.println(b);
		String q ="";
   for (int i=0; i<l; i++) {
	 q = q+ x.charAt(i);
	 
   }
  
   System.out.println(q);

	}

}
