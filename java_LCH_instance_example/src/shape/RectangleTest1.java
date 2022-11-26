package shape;

public class RectangleTest1 {
	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1(2, 2, 8, 7);
		Rectangle1 s = new Rectangle1(5, 5, 6, 6);
		Rectangle1 t = new Rectangle1(1, 1, 10, 10);
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
		}
}
