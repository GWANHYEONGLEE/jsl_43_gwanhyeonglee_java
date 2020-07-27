package Main;

public class J0727_1 {
	public int getTotal(String a, String b) {
		int result = 0;
		try {
			result = Integer.parseInt(a) +
				Integer.parseInt(b);
		}catch(Exception e) {
			System.out.println(" 형변환 오류~~~");
			result = -1;
		}

		return result;
	}
}
