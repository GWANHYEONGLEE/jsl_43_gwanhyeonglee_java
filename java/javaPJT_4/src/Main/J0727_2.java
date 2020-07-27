package Main;

public class J0727_2 {
	public int getTotal(String a, String b) throws Exception{ // 오류가 나면 이 메소드를 호출하는
															  //사람한테 오류를 던저준다.
			int result = Integer.parseInt(a) +
				Integer.parseInt(b);

		return result;
	}
}
