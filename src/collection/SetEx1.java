package collection;

import java.util.HashSet;

public class SetEx1 {

	public static void main(String[] args) {
		String a = new String ("raju");
		String b = new String ("mehedi");
		String c = new String ("rafi");
		
		HashSet <String> s = new HashSet <String> ();
		
		s.add(a);
		s.add(b);
		s.add(c);
	int l =	s.size();
	System.out.println(l);
	
	s.remove(b);
	
	for(String i: s) {
		
		System.out.println(i);
	}
		
		

	}

}
