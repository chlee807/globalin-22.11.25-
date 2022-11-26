package employee_regular_temporary;

public class Temporary extends Employee {
	private int workHours;
	private int timePay;

	public Temporary(String name, int age, String addr, String dept) {
		super(name, age, addr, dept);
		timePay = 10000;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
		this.salary = workHours * this.timePay;
	}

	public void printInfo() {
		super.printInfo();

		System.out.println("비정규직");
		System.out.println("일한시간"+workHours);
		System.out.println("월급: "+salary);
	}
}
