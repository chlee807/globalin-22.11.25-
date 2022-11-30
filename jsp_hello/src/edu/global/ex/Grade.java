package edu.global.ex;

public class Grade {
	private int kor;
	private int eng;
	private int math;
	
	public Grade() {}

	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		int total = kor + eng + math;
		return total;
	}

	public double getAverage() {
		int total = kor + eng + math;
		double avg = total / 3.0;
		return avg;
	}
	public String getGrade() {

		double avg = getAverage();
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
