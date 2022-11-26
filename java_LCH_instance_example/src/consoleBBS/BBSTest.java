package consoleBBS;

public class BBSTest {
	public static void main(String[] args) {
		ConsoleBBS bbs = new ConsoleBBS();
		try {
			bbs.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
