package circle;

class Circle{
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(r, 2);
	}
	
	public String toString() {
		return String.valueOf(getArea());
	}
}
public class CircleToString {
	public static void main(String[] args) {
		
		Object obj = new Circle(10);
		System.out.println(obj);
		/*
		 * 10.아래의 출력 결과가 아래와 같이 나오도록 프로그래밍 하시오. Object obj = new Circle(10);
		 * 
		 * System.out.println(obj); //출력: 넓이는 100 입니다. (예시)
		 */
	}
}
