package equalsTest;

class INum {
	private int num;
	
	public INum(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (((INum)obj).num == this.num) 
			return true;
		else
			return false;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		//main 에서 아래를 넣고 돌아가도록 하시오.       출력 : true

        INum iNum1 = new INum(3);
        INum iNum2 = new INum(3);

        System.out.println(iNum1.equals(iNum2));
}
}
