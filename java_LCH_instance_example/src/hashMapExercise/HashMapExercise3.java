package hashMapExercise;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExercise3 {
	public static void main(String[] args) {
		HashMap<String, Integer> nationMap = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);

		String nation = "";
		int pop = 0;

		System.out.println("나라이름과 인구를 입력하세요('그만'을 입력하면 입력을 멈춥니다)");

		for (;;) {
			for (;;) {
				try {
					System.out.print("나라를 입력하세요>>");
					nation = scan.next();
					if (nation.equals("그만")) {
						System.out.println("입력완료");
						break;
					}
					System.out.print("인구를 입력하세요>>");
					pop = scan.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("잘못된 입력입니다");
					continue;
				}
			}
			if (nation.equals("그만"))
				break;
			else
				nationMap.put(nation, pop);
		}

		for (;;) {
			try {
				System.out.print("나라 이름, 인구 >>");

				nation = scan.next();

				if (nation.equals("그만"))
					break;

				else if (nationMap.containsKey(nation))
					System.out.println(nation + " 의 인구는" + nationMap.get(nation) + "입니다");
				else
					System.out.println(nation + " 나라는 없습니다.");

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("잘못된 입력입니다.");
			}
		}
		scan.close();
	}
}