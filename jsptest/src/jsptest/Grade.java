package jsptest;

public class Grade {
	private int kor;
	private int eng;
	private int math;

	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public double average() {
		int total = kor + eng + math;
		return total / 3.0;
	}

	public String getGrade() {
		double avg = average();
		String str = null;
		if (avg >= 90)
			str = "수 입니다";
		else if (avg >= 80)
			str = "우 입니다";
		else if (avg >= 70)
			str = "미 입니다";
		else if (avg >= 60)
			str = "양 입니다";
		else
			str = "가 입니다";
		return str;
	}
}
