package newclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	
	 private static final String emailregex =
		       "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		           + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

private static final Pattern emailPattern = Pattern.compile(emailregex);


	public static void main(String[] args) {
		String email= "hasin.ca.com";
		
	boolean t=	isValidEmail("sajjad123@yahoo.com");
boolean b=		email.contains("@");
			   System.out.println(t);
			   
			}
	public static boolean isValidEmail(String email) {
	       Matcher matcher = emailPattern.matcher(email);
	       return matcher.matches();
		
	}
	
		 
		
}
