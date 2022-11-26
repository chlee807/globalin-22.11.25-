package grade_by_avg;

public class Grade {
	private int math;
	private int science;
	private int english;
	
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public double average() {
		int total = math + science + english;
		double avg = total / 3.0;
		return avg;
	}
	
	public String getGrade() {
		
		double avg = average();
		String str = null;
		if (avg >= 90) {
			str = "수 입니다";
		}
		else if (average() >= 80) {
			str = "우 입니다";
		}
		else if (average() >= 70) {
			str = "미 입니다";
		}
		else if (average() >= 60) {
			str = "양 입니다";
		}
		else {
			str = "가 입니다";
		}
		return str;
	}
}