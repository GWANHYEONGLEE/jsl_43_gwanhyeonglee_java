package dto;

public class J_0715_dto {
	String name;
	double kor, eng, mat, total, eva;
	public J_0715_dto(String name, double kor, double eng, double mat, double total, double eva) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.total = total;
		this.eva = eva;
	}
	public String getName() {
		return name;
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
	public double getEva() {
		return eva;
	}


}
