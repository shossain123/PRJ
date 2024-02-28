package polymorphism;

public class OverL1 {

	public static void main(String[] args) {
		
		OverL1 p = new OverL1();
		
		p.employeeIncome();
		p.employeeIncome(1000);
		p.employeeIncome(1000,250);
		
		OverR1 m = new OverR1();
		m.employeeIncome(2000);
		m.employeeIncome(2000,450);
		
		add("rahim");
		sub("my", "name");
		
		
	int r = myMethod(100);
		
		

	}
	
	public void employeeIncome() {
		int salary = 1000;
		int bonus = 200;
		int totalIncome = salary+bonus;
		System.out.println(totalIncome);
	}
	
	public void employeeIncome(int salary) {
		System.out.println(salary);
		
	}
	
	public void employeeIncome(int salary,int bonus) {
		int totalIncome = salary+bonus;
		System.out.println(totalIncome);
		
	}
	public static void add(String a) {
		System.out.println("hello");
	}

	public static void sub(String t, String p) {
		System.out.println("hi");
	}
	
	public static int myMethod(int x) {
	
		System.out.println(x);
		return x;
	}

}
