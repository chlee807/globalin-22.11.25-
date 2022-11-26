package random_char_array_5x3;

public class RandomCharArray5x3 {
	public static void main(String[] args) {
		char[][] array = new char[5][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (char)(Math.random()*26+65);
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
