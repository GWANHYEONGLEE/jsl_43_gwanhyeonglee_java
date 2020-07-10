
public class J_0710_dto_2 {
	String name;
	int kor, eng ,mat, total;

	public J_0710_dto_2(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		total = kor + eng + mat;
	}
	String getName() {
		return name;
	}
	int getKor() {
		return kor;
	}
	int getEng() {
		return eng;
	}

	int getMat() {
		return mat;
	}

	int getTotal() {
		return total;
	}


}




