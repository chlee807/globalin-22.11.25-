package grade_by_avg;
import java.util.Scanner;

public class ScoreTest {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int math = sc.nextInt();
	    int science = sc.nextInt();
	    int english = sc.nextInt();
	    
	    Grade me = new Grade(math, science, english);
	    System.out.println("평균은 "+me.average());
	    System.out.println(me.getGrade()); // 수 입니다
	}
}
