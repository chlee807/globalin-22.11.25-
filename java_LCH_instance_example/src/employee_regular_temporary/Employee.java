package employee_regular_temporary;

public class Employee {
	private String name;
	private int age;
	private String addr;
	private String dept;
	protected int salary;
	
	public Employee(String name, int age, String addr, String dept){
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.dept = dept;
	}
	
	public void printInfo() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("주소: "+addr);
		System.out.println("부서: "+dept);
	}
}
