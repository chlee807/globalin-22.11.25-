package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Example {
	public static void main(String[] args) {
		/*
		 * "5. IO 스트림을 이용하여 아래와 같이 프로그램을 완성하시오. ================= 대상 파일: a.java 사본 이름:
		 * x:\b.java"
		 */
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\2021-08-05\\2022it\\IT\\webSRC\\java_hello\\data.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\2021-08-05\\2022it\\IT\\webSRC\\java_hello\\data2.txt"))) {
			String str;
			while (true) {
				str = br.readLine();
				if (str == null)
					break;
				bw.write(str+"123");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
