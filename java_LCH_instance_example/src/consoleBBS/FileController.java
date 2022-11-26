package consoleBBS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class FileController {
	public static String fileName;
	Scanner scan = new Scanner(System.in);
	Post[] postArray = new Post[5];

	public static void setFileName(String fileName) {
		FileController.fileName = fileName;
	}

	public int fileCount() {
		int num = 1;
		for (;;) {
			File file = new File("BBS" + num + ".txt");
			if (file.exists())
				num++;
			else
				break;
		}
		return num - 1;
	}

	public void exportBBS(List<Post> bbs) {
		int exportNo = fileCount() + 1;
		setFileName("BBS" + exportNo + ".txt");
		long millis = System.currentTimeMillis();
		SimpleDateFormat exportTimeInfo = new SimpleDateFormat("MM-dd-yyyy/ HH:mm:ss");
		String exportTime = exportTimeInfo.format(millis);
		System.out.println(exportNo + "번째 파일(파일저장시간: " + exportTime + ")");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
			bw.write(exportNo + "번째 파일(파일저장시간: " + exportTime + ")");
			bw.newLine();
			for (int num = 0; num < bbs.size(); num++) {
				bw.write(bbs.get(num).postWriter().toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void importBBS(List<Post> bbs) {
		System.out.println("몇 번째 파일을 불러올까요?(기존에 남아있던 게시글에 이어 연속적으로 추가됩니다)");
		int importNo = inputCheck(1, fileCount());
		if (importNo == 0) {
			System.out.println("비정상적인 접근으로, 파을 불러올 수 없습니다");
			return;
		} else
			setFileName("BBS" + importNo + ".txt");
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String str;
			int postCheck = 0;
			int i = 0;
			postArray[i] = new Post();
			for (int fileLine = 1; (str = br.readLine()) != null; fileLine++) {
				if (fileLine == 1) {
					System.out.println(str + "을 불러옵니다");
				} else {
					postCheck++;
					postArray[i].postReader(postArray[i], str, fileLine);
					if ((postCheck % 6) == 0) {
						bbs.add(postArray[i++]);
						if (i >= postArray.length) {
							Post[] postArray = new Post[this.postArray.length + 5];
							for (int j = 0; j < this.postArray.length; j++) {
								postArray[j] = this.postArray[j];
							}
							this.postArray = postArray;
						}
						postArray[i] = new Post();
					}
				}
			}
			if (postCheck == 0) {
				System.out.println("게시글이 저장되지 않은 빈 파일입니다");
				System.out.println("게시판 초기화를 원하시나요? (Y:초기화 진행, N:초기화 취소)");
				for (;;) {
					String reply = scan.next();
					if (reply.equals("Y")) {
						for (int num = bbs.size()-1; num >= 0; num--)
							bbs.remove(num);
						System.out.println("초기화 완료");
						break;
					} else if (reply.equals("N")) {
						System.out.println("초기화 취소");
						return;
					} else {
						System.out.println("잘못입력하셨습니다. 다시입력해주세요");
						continue;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
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
					System.out.println("해당 번호의 파일이 없습니다. 다시입력해주세요");
					continue;
				}
			} catch (Exception e) {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요");
				continue;
			}
		}
	}
}
