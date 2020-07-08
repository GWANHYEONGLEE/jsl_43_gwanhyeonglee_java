
public class J_0708_4 {

	public static void main(String[] args) {

	J_0708_dto dto = new J_0708_dto();
	int Kor = 20;
	int Eng = 30;
	int Mat = 40;
	J_0708_dto dto2 = new J_0708_dto("ȫ�浿",Kor,Eng,Mat);

	System.out.println("name:"+dto.getName());
	System.out.println("name:"+dto2.getName());
	System.out.println("Kor:"+dto2.setKor());
	System.out.println("Eng:"+dto2.setEng());
	System.out.println("Mat:"+dto2.setMat());

	}

}
