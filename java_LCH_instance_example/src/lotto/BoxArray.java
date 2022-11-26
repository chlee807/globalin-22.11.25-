package lotto;

class Circle{
	private int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}

public class BoxArray {
	public static int[] makeLotto() {
		int[] arr = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
		}
		return arr;
	}
	
	public static void main(String[]args) {
		
		for (String arg: args) {
			System.out.println(arg);
		}
		
		Circle[] arrCircle = {new Circle(10), new Circle(20)};
		/*
		 * Circle[] arrCircle = new Circle[2]; arrCircle[0] = new Circle(10);
		 * arrCircle[0] = new Circle(20);
		 */
		
		double sumArea = sumCircles(arrCircle);
		System.out.println(sumArea);
		
		int[] arrLotto = makeLotto();
		for (int num : arrLotto) {
			System.out.println(num);
		}
	}
	public static double sumCircles(Circle[] arrCircle) {
		
		double sum = 0;
		for (int i = 0; i < arrCircle.length; i++) {
			sum += arrCircle[i].getArea();
		}
		return sum;
	}
}
