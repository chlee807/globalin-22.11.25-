package StringTokenizerTest;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("PM:08:45", ":");
		while(st1.hasMoreTokens())
			System.out.print(st1.nextToken()+" ");
		System.out.println();
		/*
		 * 아래와 같이 출력 되도록 위의 코드를 완성 하시오. 출력: PM 08 45
		 */
	}
}
