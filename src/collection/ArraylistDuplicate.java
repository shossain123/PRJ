package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ArraylistDuplicate {

	public static void main(String[] args) {
		String a = new String ("rahman");
		String b = new String ("zafrin");
		String c = new String ("kaku");
		String d = new String ("kaku");
		String e = new String ("rahman");

  ArrayList <String> s = new ArrayList <String>();
		s.add(a);
		s.add(b);
		s.add(c);
		s.add(d);
		s.add(e);
	int l =	s.size();
	System.out.println(l);
	HashSet <String> set = new HashSet <String> ();
	for(String i : s){
		
		if(set.add(i) == false) {
			System.out.println(i);
		}
		
	}


	}
	

}
