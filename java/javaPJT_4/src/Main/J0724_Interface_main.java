package Main;

public class J0724_Interface_main extends J0724_parent
implements J0724_Interface_1, J0724_Interface_2 { //�������̽��� ��ӹ�������
	                                              //extends�� ��������ʴ´�.
	 											  //�ϳ� �̻��� �����ü� �ִ�.
	public String getName() {
		return "ȫ";
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
		return "��";
	}
}
