package homeexercise;

public class ConcateEx {

	public static void main(String[] args) {
		 String t =concate("Hi", " Sajjad");
		 System.out.println(t);

	}
	public static String concate(String greeting, String user ) {
		
		String value = greeting + user;
		
		
		return value;
	}

}
