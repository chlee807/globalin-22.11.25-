package employee_regular_temporary;

public class Regular extends Employee {

	public Regular(String name, int age, String addr, String dept) {
		super(name, age, addr, dept);
	}

	public void setSalary(int salary) {
		super.salary = salary;
	}
	
	public void printInfo(){
		super.printInfo();
		
		System.out.println("정규직");
		System.out.println("월급: "+super.salary);
	}
}
