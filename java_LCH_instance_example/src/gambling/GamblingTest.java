package gambling;

import java.util.Scanner;

public class GamblingTest {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("참가자 인원 수를 입력하세요");
		int n = scan.nextInt();
		String name;
		Person[] member = new Person[n];
		int cntForResult = 0;
		
		for (int i = 0; i < member.length; i++) {
			System.out.println((i+1)+"번째 선수 이름>>");
			name = scan.next();
			member[i] = new Person(name);
		}
		
		for(int i = 0;;i++) {
			for(int j = 0; j < member.length; j++) {
				member[j].setNums();
				cntForResult += member[j].result();
			}
			if (cntForResult > 0) {
				break;
			}
		}
	}
}
