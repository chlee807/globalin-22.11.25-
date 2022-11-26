package hashMapExercise;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapExercise {
	public static void main(String[] args) {
		/*
		 * 이름과 학점>> 강나래 3.1 
		 * 이름과 학점>> 니보라 3.3 
		 * 이름과 학점>> 강하늘 4.3 
		 * 이름과 학점>> 울나리 4.0 
		 * 이름과 학점>>그만해 3.7
		 * 
		 * 장학생 선발 학점 기준 입력>> 3.2 
		 * 장학생 명단: 그만해 강하늘 니보라 울나리
		 */

		HashMap<String, Double> studentMap = new HashMap<String, Double>();
		Set<String> ks = studentMap.keySet();
		Scanner scan = new Scanner(System.in);
		final int COUNT = 5;
		String name = "";
		double grade = 0;
		double gradeCriteria = 0;

		System.out.println(COUNT + "개의 이름과 학점을 입력해주세요");
		for (int i = 0; i < COUNT; i++) {
			for (;;) {
				try {
					System.out.println("이름과 학점>> ");
					name = scan.next();
					grade = scan.nextDouble();
					break;
				} catch (Exception e) {
					System.out.println("잘못입력하셨습니다. 다시입력해주세요");
					continue;
				}
			}
			studentMap.put(name, grade);
		}

		System.out.println("장학생 선발기준 학점입력");
		for (;;) {
			try {
				gradeCriteria = scan.nextDouble();
				break;
			} catch (Exception e) {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요");
				continue;
			}
		}

		System.out.print("장학생 명단: ");
		for (String str : ks) {
			if (studentMap.get(str) > gradeCriteria) {
				System.out.print(str + " ");
			}
		}
		System.out.println();
	}
}
