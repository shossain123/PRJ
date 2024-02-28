package newclass;

public class PalindromExp {

	public static void main(String[] args) {
	            String a = new String ("madam");
	            String rev = "";
	            int l= a.length();
	            
	    for(int i=l-1; i>=0; i=i-1 ) {
	        rev = rev + a.charAt(i);
	    	
	    }
	    
	    
	    
	    
	    
	    System.out.println(rev);
	    if(a.equals(rev)) {
	    	System.out.println( a +"     String is palindrom");
	    }
	    else {
	    	System.out.println("String is not palindrom");
	    }

	}

}
