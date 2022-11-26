package hashMapExercise;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapExercise2 {
	public static void main(String[] args) {
		HashMap<String, Integer> nationMap = new HashMap<>();
		Set<String> ks = nationMap.keySet();
		Scanner scan = new Scanner(System.in);
		final int COUNT = 5;
		String nation = "";
		String nationMax = "";
		int pop = 0;
		int popMax = 0;

		System.out.println("나라 이름과 인구를 5개 입력하세요.");
		for (int i = 0; i < COUNT; i++) {
			System.out.println("나라 이름, 인구 >> ");
			for (;;) {
				try {
					nation = scan.next();
					pop = scan.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("잘못입력하셨습니다");
					continue;
				}
			}
			nationMap.put(nation, pop);
		}

		for (String str : ks) {
			int compare = nationMap.get(str);
			if (popMax < compare) {
				popMax = compare;
				nationMax = str;
			}
		}

		System.out.println("(" + nationMax + ", " + popMax + ")");
	}
}
