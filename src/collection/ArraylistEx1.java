package collection;

import java.util.ArrayList;

public class ArraylistEx1 {

	public static void main(String[] args) {
		String a = new String ("opu");
		String b = new String ("babu");
		String c = new String ("kaku");
		String d = new String ("david");
		
		ArrayList <String> s = new ArrayList <String> ();
		
		int l = s.size();
		System.out.println(l);
		
		s.add(a);
		s.add(b);
		s.add(c);
		s.add(d);
		
		l= s.size();
		System.out.println(l);
		
		String t = s.get(2);
		System.out.println(t);
		
	//	s.remove(b);
	//	s.remove(2);
	boolean    o =	s.contains("opu");
	System.out.println(o);
		for(String i : s) {
			
			System.out.println(i);
			
		}
		
		System.out.println(".............");
		
		for(int p=l-1; p>=0; p= p-1) {
		String r =	s.get(p);
		System.out.println(r);
		}
		
		
		
	
		

	}

}
