package tv;

public class ColorTV extends TV1 {
	private int color;
	
	ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
}