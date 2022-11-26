package consoleBBS;

public enum Mode {

	EXIT(0, "종료"), LIST(1, "목록"), INSERT(2, "등록"), SELECT(3, "내용"), DELETE(4, "삭제"), EXPORT(5, "파일 내보내기"), IMPORT(6, "파일 가져오기");
	
	private final int value;
	private final String mode;
	
	Mode(int value, String mode) {
		this.value = value;
		this.mode = mode;
	}
	public int getValue() {
		return value;
	}
	public void showMode() {
		System.out.print(value+"."+mode+"  ");
	}
}
