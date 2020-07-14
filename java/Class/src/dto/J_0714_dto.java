package dto;

public class J_0714_dto {
	String name;
	int kor, eng, total, ava;
	public J_0714_dto(String name, int kor, int eng, int total, int ava) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = total;
		this.ava = ava;
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
	public int getTotal() {
		return total;
	}
	public int getAva() {
		return ava;
	}

}
