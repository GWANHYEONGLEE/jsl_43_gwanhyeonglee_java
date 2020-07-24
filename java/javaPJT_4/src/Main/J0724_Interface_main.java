package Main;

public class J0724_Interface_main extends J0724_parent
implements J0724_Interface_1, J0724_Interface_2 { //인터페이스를 상속받을때는
	                                              //extends를 사용하지않는다.
	 											  //하나 이상을 가져올수 있다.
	public String getName() {
		return "홍";
	}
	@Override
	public int getEng() {
		return 90;
	}
	@Override
	public  int getTotal(int kor, int eng) {
		return kor + eng;
	}
	public  int getAva(int total, int count) {
		return total / count;
	}
	public String getResult(int ava){
		return "우";
	}
}
