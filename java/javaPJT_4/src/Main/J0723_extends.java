package Main;

public class J0723_extends {

	public static void main(String[] args) {
		J0723_child child = new J0723_child(); //자식 클래스 생성 child는
											   //2개의 메서드를 가지고있음.
		child.childPrint();
		child.parentsPrint();              //부모클래스 <<< 자식클래스
	}

}
