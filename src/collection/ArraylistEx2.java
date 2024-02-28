package collection;

import java.util.ArrayList;

public class ArraylistEx2 {

	public static void main(String[] args) {
		String a = new String ("rahman");
		String b = new String ("babu");
		String c = new String ("kaku");
		
		ArrayList <String> s = new ArrayList <String>();
		
		s.add(a);
		s.add(b);
		s.add(c);
	int l =	s.size();
	System.out.println(l);
	String g = s.get(2);
	System.out.println(g);
	
	//s.remove(b);
	
	for(String i : s){
		System.out.println(i);
	}
	System.out.println("--------");
		
for(int i= l-1; i>=0; i--) {
	System.out.println(s.get(i));
}
	}
	

}
