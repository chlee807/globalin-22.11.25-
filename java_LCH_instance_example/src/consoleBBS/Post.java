package consoleBBS;

import java.text.SimpleDateFormat;

public class Post {
	private int no;
	private String title;
	private String content;
	private String writer;

	private long millis = System.currentTimeMillis();
	private SimpleDateFormat postTimeInfo = new SimpleDateFormat("MM-dd-yyyy/ HH:mm:ss");
	private String postTime = postTimeInfo.format(millis);

	public void setNo(int cnt) {
		this.no = cnt;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void showEnrollCheck() {
		System.out.print(title + "\t" + "\t");
		System.out.print(content + "\t" + "\t");
		System.out.println(writer);
	}

	public void showPost() {
		System.out.print(title + "\t" + "\t");
		System.out.print(writer + "\t" + "\t");
		System.out.println(postTime);
	}

	public void showEntirePost() {
		System.out.print("NO." + no + "\t" + "\t");
		System.out.print(title + "\t" + "\t");
		System.out.print(content + "\t" + "\t");
		System.out.print(writer + "\t" + "\t");
		System.out.println(postTime);
	}

	public StringBuilder postWriter() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("No." + no);
		sb.append("\n");
		sb.append("제목: " + title);
		sb.append("\n");
		sb.append("내용: " + content);
		sb.append("\n");
		sb.append("작성자: " + writer);
		sb.append("\n");
		sb.append("작성시간: " + postTime);
		sb.append("\n");
		return sb;
	}

	public void postReader(Post post, String str, int fileLine) {
		int readLine = fileLine % 6;
		switch (readLine) {
		case 3:
			try {
				no = Integer.parseInt(str.substring(3, str.length()));
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				title = str.substring(4, str.length());
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 5:
			try {
				content = str.substring(4, str.length());
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 0:
			try {
				writer = str.substring(5, str.length());
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 1:
			try {
				postTime = str.substring(6, str.length());
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
	}
}
