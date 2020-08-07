package dto;

public class J0806_dto {
	String no, name;
	int kor, eng, mat, total, ava;
	public J0806_dto(String no, String name, int kor, int eng, int mat, int total, int ava) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.total = total;
		this.ava = ava;
	}
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	public int getTotal() {
		return total;
	}
	public int getAva() {
		return ava;
	}
}
