package gambling;

import java.util.Scanner;

public class Person {
	private String name;
	private int[] nums = new int[3];
	Scanner scan = new Scanner(System.in);
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setNums() {
		System.out.println("["+name+"]:");
		scan.nextLine();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*3+1);
		}
	}
	public int result() {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
		if (nums[0] == nums[1] && nums[1] == nums[2]) {
			System.out.println(name+"님이 이겼습니다");
			return 1;
		}
		else {
			System.out.println("아쉽군요!");
			return 0;
		}
	}
}
