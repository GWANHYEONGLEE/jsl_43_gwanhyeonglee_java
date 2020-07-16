package dto;

public class J0716_1_dto {
	String name, result, ava;
	int kor, eng, total;
	public J0716_1_dto(String name, String ava, String result, int kor, int eng, int total ) {
		this.name = name;
		this.ava = ava;
		this.result = result;
		this.kor = kor;
		this.eng = eng;
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public String getAva() {
		return ava;
	}
	public String getResult() {
		return result;
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

}
