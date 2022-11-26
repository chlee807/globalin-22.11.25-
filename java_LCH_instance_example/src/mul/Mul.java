package mul;

public class Mul {
	public static void main(String[]args) {
		int cnt = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
				cnt++;
			}
		}
		System.out.println("count: "+cnt);
	}
}
