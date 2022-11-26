package fruitArray;

abstract class Fruit {
	public void print() {};
}

class Grape extends Fruit{
	public void print() {
		System.out.println("나는 포도이다.");
	}
}

class Apple extends Fruit{
	public void print() {
		System.out.println("나는 사과이다.");
	}
}

class Pear extends Fruit{
	public void print() {
		System.out.println("나는 배이다.");
	}
}

public class FruitArrayTest {
	public static void main(String[]args) {
		Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
		for(Fruit f : fAry)
		f.print();
	}
}
