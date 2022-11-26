package employee_regular_temporary;

public class AllEmployeeTest {
	public static void main(String[]args) {
		Regular kim = new Regular("김길동", 19, "서울 뉴욕시", "개발 1팀");
		kim.setSalary(10000);
		kim.printInfo();
		
		System.out.println();
		
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");
		t.setWorkHours(120);
		t.printInfo();
	}
}

