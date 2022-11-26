package sumation;

public class GetSum {
	int num;
	int sumNum(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum +=i;
		}
		return sum;
	}
}
