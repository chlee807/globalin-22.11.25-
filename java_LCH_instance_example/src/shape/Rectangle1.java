package shape;

public class Rectangle1 {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle1(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width * height;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	public boolean contains(Rectangle1 r) {
		if ( (x < r.x) && ( (x+width) > (r.x + r.width) ) && (y < r.y) && (y + height > (r.y + r.height) ) ) {
			return true;
		}
		else
			return false;
	}
}
