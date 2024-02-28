package day5;

public class student1 {
	int id ;
	int ph ;
	
	public student1(int x, int y) {
		id = x ;
		ph = y ;
		
	}
	public void show() {
		
		System.out.println(ph);
	}

	public static void main(String[] args) {
     student1 t = new student1(24,303);
             t.show();
     student1 t1 = new student1(25,403);
             t1.show() ;
     student1 t2 = new student1(26,503)  ;
              t2.show() ;
              
          System.out.println(t.id);   
             
     
		
		
	}
}
