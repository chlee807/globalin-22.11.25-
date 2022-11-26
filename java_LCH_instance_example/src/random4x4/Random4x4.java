package random4x4;

public class Random4x4 {
	public static void main(String[]args) {
		int[][] array = new int[4][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (int)(Math.random()*10+1);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
