package homeexercise;

public class Employee {
	
	int empSsn;
	String name;
	static int counter ;
	private static double salary;
	
	
	public Employee(int x, String y) {
		empSsn = x;
		name = y;
		counter++;
		
		}
	public void show() {
		
		System.out.println(empSsn);
		System.out.println(name);
		
		
		
		
	}
	public void calculateBonus(double salary) {
		double bonus =   (salary*(0.01));
		double bonusSalary = bonus+salary;
		System.out.println(bonusSalary);
		
		
	}
	
	public static void main(String[] args) {
		Employee r = new Employee(12345,"donald trump");
		r.show();
		
		Employee r1 = new Employee(2345,"Alam Hossain");
		r1.show();
				Employee r2 = new Employee(3456,"Gulam Kabir");
		r2.show();
		r2.calculateBonus(20000);
		
		System.out.println(counter);
		

	}

}
