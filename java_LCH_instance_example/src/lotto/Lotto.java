package lotto;

public class Lotto {
	public static void main(String[]args) {
		int[] nums = new int[6];
		int temp;
		for (int i = 0; i < nums.length; i++) {
			temp = (int)(Math.random()*45+1);
			for (int j = 0; j < i; j++) {
				if (temp == nums[j]) {
					temp = 0;
					break;
				}
			}
			if (temp == 0) {
				i--;
				continue;
			}
			else 
				nums[i] = temp;
		}
		for (int i : nums) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
