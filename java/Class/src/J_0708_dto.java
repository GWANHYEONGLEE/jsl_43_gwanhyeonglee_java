
public class J_0708_dto { //메소드

	String name;   //this.name
	int kor, eng, mat, total;


	public J_0708_dto() { //	public 기본 생성자 : 매소드 이름이 class의 이름과 같다.
	}
	//오버로딩
	public J_0708_dto(String name, int Kor, int Eng, int Mat) {
		this.name = name;
		this.kor = Kor;
		this.eng = Eng;
		this.mat = Mat;
	}





	/*
	//오버로딩
	int getTotal(int a, int b) {
		return a + b;
	}


	int getTotal(int a, int b, int c) {
		return a + b +c ;
	}
	*/







	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}



	void setKor(int kor) {
		this.kor = kor;
	}
	int setKor() {
		return kor;
	}



	void setEng(int eng) {
		this.eng = eng;
	}
	int setEng() {
		return eng;
	}



	void setMat(int mat) {
		this.mat = mat;
	}
	int setMat() {
		return mat;
	}


	void setTotal(int total) {
		this.total = total;
	}
	int setTotal() {
		return total;
	}
}
