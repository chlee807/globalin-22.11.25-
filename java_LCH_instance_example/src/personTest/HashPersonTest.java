package personTest;

import java.util.HashSet;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if ((name == ((Person) obj).name) && (age == ((Person) obj).age))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return age % 100; // age의 값이 같으면 부류도 같다.
	}

}

public class HashPersonTest {
	/*
	 * 8.아래와 같이 출력되도록 하시오. HashSet<Person> hSet = new HashSet<Person>();
	 * hSet.add(new Person(""LEE"", 10)); hSet.add(new Person(""LEE"", 10));
	 * hSet.add(new Person(""PARK"", 35)); hSet.add(new Person(""PARK"", 35));
	 * 
	 * System.onut.println(""저장된 데이터 수: "" + hSet.size()); System.out.println(hSet);
	 * 
	 * 
	 * ============ 저장된 데이터 수: 2 [LEE(10세), PARK(35세)]
	 */
	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));
		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);

	}
}
