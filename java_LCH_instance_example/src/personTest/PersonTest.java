/*
 * package personTest;
 * 
 * class Person { private String name;
 * 
 * public Person(String name) { this.name = name; }
 * 
 * public String toString() { return name; }
 * 
 * @Override public boolean equals(Object obj) { if (((Person) obj).name ==
 * this.name) return true; else return false; } }
 * 
 * public class PersonTest { - 클래스 Person은 이름을 저장하는 필드 구성 - 클래스 Person은 상위 클래스
 * Object의 메소드 equals()를 오버라이딩하여 이름이 같으면 true를 반환하는 메소드 구현 - 다음과 같은 소스로 클래스
 * Person을 점검 public static void main(String[] args) { Person p1 = new
 * Person("홍길동"); System.out.println(p1.equals(new Person("홍길동")));
 * System.out.println(p1.equals(new Person("최명태"))); } }
 */