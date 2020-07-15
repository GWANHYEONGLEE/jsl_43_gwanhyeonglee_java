package dto;

public class J0715_2_dto {
	String name, result;
	double kor, eng, mat, total, ava;
	public J0715_2_dto(String name, String result, double kor, double eng, double mat, double total, double ava) {
		super();
		this.name = name;
		this.result = result;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.total = total;
		this.ava = ava;
	}
	public String getName() {
		return name;
	}
	public String getResult() {
		return result;
	}
	public double getKor() {
		return kor;
	}
	public double getEng() {
		return eng;
	}
	public double getMat() {
		return mat;
	}
	public double getTotal() {
		return total;
	}
	public double getAva() {
		return ava;
	}

}
