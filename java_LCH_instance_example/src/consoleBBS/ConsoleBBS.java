package consoleBBS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleBBS {
	int postNo = 0;
	int exportNo = 0;
	final int MODE_CNT = 7;

	Scanner scan = new Scanner(System.in);

	public void run() throws Exception {
		List<Post> bbs = new ArrayList<>();
		FileController fc = new FileController();
		for (;;) {
			int selection = initialSelect();
			Mode selectionMode = null;
			for (Mode mode : Mode.values()) {
				if (mode.getValue() == selection) {
					selectionMode = mode;
					break;
				}
			}

			switch (selectionMode) {
			case EXIT:
				System.out.println("콘솔게시판을 종료합니다");
				return;
			case LIST:
				showList(bbs);
				break;
			case INSERT:
				bbs.add(enroll());
				postCheck(bbs);
				System.out.println("글이 정상적으로 추가되었습니다");
				break;
			case SELECT:
				showList(bbs);
				postSelect(bbs);
				break;
			case DELETE:
				showList(bbs);
				try {
					bbs.remove(postDelete(bbs));
				} catch (Exception e) {
					System.out.println("비정상적인 접근으로, 글이 삭제되지 않았습니다");
					break;
				}
				System.out.println("글이 정상적으로 삭제되었습니다");
				showList(bbs);
				break;
			case EXPORT:
				fc.exportBBS(bbs);
				break;
			case IMPORT:
				fc.importBBS(bbs);
				break;
			}
		}
	}

	public int inputCheck(int begin, int end) {
		int num;
		if (begin > end) {
			return 0;
		}
		for (;;) {
			try {
				num = Integer.parseInt(scan.next());
				if ((num >= begin) && (num <= end)) {
					return num;
				} else {
					System.out.println("해당 번호에 해당되는 명령어가 없습니다. 다시입력해주세요");
					continue;
				}
			} catch (Exception e) {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요");
				continue;
			}
		}
	}

	public int initialSelect() {
		for (Mode mode : Mode.values()) {
			mode.showMode();
		}
		System.out.print(">");
		return inputCheck(0, MODE_CNT - 1);
	}

	public void postCheck(List<Post> bbs) {
		int num = bbs.size();
		System.out.print(num-- + "\t" + "\t");
		bbs.get(num).showEnrollCheck();
	}

	public void showList(List<Post> bbs) {
		System.out.println("======================================================");
		System.out.println("번호\t\t제목\t\t작성자\t\t작성일");
		System.out.println("------------------------------------------------------");
		for (int num = 0; num < bbs.size(); num++) {
			System.out.print((num + 1) + "\t" + "\t");
			bbs.get(num).showPost();
		}

	}

	public Post enroll() {
		Post post = new Post();
		post.setNo(++postNo);

		scan.nextLine();
		System.out.print("제목>");
		post.setTitle(scan.nextLine());
		System.out.print("내용>");
		post.setContent(scan.nextLine());
		System.out.print("작성자>");
		post.setWriter(scan.nextLine());
		return post;
	}

	public void postSelect(List<Post> bbs) {
		System.out.println("열람할 게시글의 번호를 입력하세요");
		int num = inputCheck(1, bbs.size());
		if (num == 0) {
			System.out.println("비정상적인 접근으로, 게시글을 열람할 수 없습니다");
			return;
		}
		System.out.println("======================================================");
		System.out.println("번호\t\t(고유번호)\t\t제목\t\t내용\t\t작성자\t\t작성일");
		System.out.println("------------------------------------------------------");
		System.out.print(num-- + "\t" + "\t");
		bbs.get(num).showEntirePost();
	}

	public int postDelete(List<Post> bbs) {
		System.out.println("삭제할 게시글의 번호를 입력하세요");
		int num = inputCheck(1, bbs.size());
		return --num;
	}
}
