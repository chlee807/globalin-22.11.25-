package randomChar4x4;

import java.util.Scanner;

public class RandomChar4x4 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int row = 0;
		int col = 0;
		int temp;
		
		//행입력
		for (;;){
			System.out.println("행의 크기를 입력하세요");
			try {
				temp = Integer.parseInt(scan.next());
			}catch(Exception e) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			
			if (temp >= 1 && temp <= 10) {
				row = temp;
				break;
			}
			else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
		//열입력
		for (;;){
			System.out.println("열의 크기를 입력하세요");
			try {
				temp = Integer.parseInt(scan.next());
			}catch(Exception e) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			
			if (temp >= 1 && temp <= 10) {
				col = temp;
				break;
			}
			else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
		//배열생성
		char[][] array = new char[row][col];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (char)(Math.random()*26+65);
			}
		}
		//배열출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
