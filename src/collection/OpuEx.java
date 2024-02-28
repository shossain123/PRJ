package collection;

import java.util.ArrayList;

public class OpuEx {

	public static void main(String[] args) {
		String a= new String("Apu");
		String b = new String("karim");
		String c = new String ("opu");
		ArrayList <String> s = new ArrayList<String>();
		s.add(a);
		s.add(b);
		s.add(c);
		s.add(c);
		
		int q =	s.indexOf("opu");
		System.out.println(q);
	System.out.println(s.isEmpty());	
		
	boolean t =	s.contains("opu");
	System.out.println(t);
	int count=0;
	for(String name: s) {
		
		//System.out.println(name);
	
		if( name.equals("opu")) {
			//System.out.println("exist");
			count=count+1;
		}
		
	}
		
		System.out.println(count);

	}

}
