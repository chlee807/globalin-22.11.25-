package grade_by_avg;

public class Avg {
	public static void main(String[]args) {
		System.out.println(grade(avg(70,70,70)));
	}
	public static char grade(double avg) {
		if (avg >= 90) {
			return '수';
		}
		else if (avg >= 80) {
			return '우';
		}
		else if (avg >= 70) {
			return '미';
		}
		else if (avg >= 60) {
			return '양';
		}
		else {
			return '가';
		}
	}
	
	public static double avg(int kor, int eng, int math) {
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		return avg;
	}
}
