package exercise;

public class Employee {
	int ssn;
	String name;
	static int counter;
	private int salary;
	static int t;

	
	public Employee(int x, String y, int s) {
		ssn = x;
		name = y;
		salary = s;
		counter++;
		
	}
	public void tester() {  //why we didn"t use static
		
		System.out.println(ssn);
		System.out.println(name);
		System.out.println(counter);
	}
	public  int calculateBonus() {
		 // what is private variable
		int bonus =  (int) (salary * 0.01);
		int total = salary+bonus;
		
		return total;
		
		}
	public static void show() {
		System.out.println("show me");
		 t++;
		System.out.println(t);
	}

	public static void main(String[] args) {
		
		Employee r = new Employee(12345, "Donald Trump",120000);
		r.tester();
		r.show();
		Employee r1 = new Employee(2345, "Alam Hossain",100000);
		r1.tester();
		r1.show();
		Employee r2 = new Employee(3456,"Gulam Kabir",200000);
		r2.tester();
	int	b = r1.calculateBonus();
	System.out.println(b);
	
	//int obj = r.counter;
    //System.out.println(obj);		
	
		

	}

}
