package Main;

public class J0724_child_two extends J0724_parent {
	@Override
	public int getTotal(int kor, int eng) {
		return kor + eng;
	}
	@Override
	public int getAva(int t, int c) {
		return t / t;
	}

	public String getName() {
		return "ȫ�浿";
	}
	@Override
	public int getEng() {
		return 90;
	}

}
