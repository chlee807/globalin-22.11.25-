package edu.global.ex;

public class Grade {
	private int kor;
	private int eng;
	private int math;

	Grade(int math, int science, int english) {
		this.kor = math;
		this.eng = science;
		this.math = english;
	}

	public double average() {
		int total = kor + eng + math;
		double avg = total / 3.0;
		return avg;
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
