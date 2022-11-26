package dBoxTest;

class DBox<L, R> {
	private L left;
	private R right;

	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}

	public String toString() {
		return left + " & " + right;
	}
}

public class DBoxTest {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box);
	}
}
