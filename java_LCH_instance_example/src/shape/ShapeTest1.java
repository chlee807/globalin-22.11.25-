package shape;

interface Shape1{
	double getArea();
}

class Circle1 implements Shape1{
	private double r;
	
	public Circle1(double r) {
		this.r = r;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(r, 2);
	}
}

class Triangle implements Shape1{
private double width, height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height / 2;
	}
}

class Rectangle implements Shape1{
private double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
}

public class ShapeTest1 {
	public static void main(String[]args) {
		Shape1[] shape = {new Circle1(10),new Triangle(10, 10),new Rectangle(10, 10)};
        double sumArea = 0;
        for (Shape1 s : shape) {
                sumArea += s.getArea();
            }
        System.out.println(sumArea);
	}
}
