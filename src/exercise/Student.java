package exercise;

public class Student {
	
	int id;
	String name;
	int phNumber ;
	
	public Student(int x, String y, int z) {
		id = x;
		name = y;
		phNumber = z;
		
		
	}

	public static void main(String[] args) {
		Student m = new Student(22, "raju", 6211);
		int p = m.id;
		System.out.println(p);
		String o = m.name;
		System.out.println(o);
		int k = m.phNumber;
		System.out.println(k);
		
		
		
		
		

	}

}
