package shape;

interface Shape {
	final double PI = 3.14; // 상수
	void draw(); // 도형을 그리는 추상 메소드
	
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}
//다음 main() 메소드와 실행 결과를 참고하여, 인터페이스 Shape을 구현한 클래스 Circle를 작성하고 전체 프로그램을 완성하라.

class Circle implements Shape {
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public void draw() {
		System.out.println("반지름이"+r+"인 원입니다");
	}
	
	public double getArea() {
		return PI * Math.pow(r, 2);
	}
	
	public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Oval implements Shape {
	private double a,b;
	
	public Oval(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void draw() {
		System.out.println(a+"x"+b+"에 내접하는 타원입니다");
	}
	
	public double getArea() {
		return PI * (a / 2) * (b / 2);
	}
	
	public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class Rect implements Shape {
	private double a,b;
	
	public Rect(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void draw() {
		System.out.println(a+"x"+b+"크기의 직사각형입니다");
	}
	
	public double getArea() {
		return a * b;
	}
	
	public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}
public class ShapeMain {
	public static void main(String[] args) {
		Shape[] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		list[0] = new Circle(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40); // 10x40 크기의 사각형
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
	}
}