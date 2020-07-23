package Main;

public class J0723_child extends J0723_parents{
	public J0723_child() {
		System.out.println("J0723_child 생성자");

	}
	@Override
	public void parentsPrint() {
		System.out.println("child~~~print~~");
	}
	public void childPrint() {
		System.out.println("J0723_child~~");
	}
}
//Override 는 부모 클래스의 매소드를 자식 클래스에서 빌려쓰고 있음을 표시
//Overloading 은 한 클래스 안에서 같은 메소드 이름, 같은 타입의 메소드를 사용하고 있음을 표시(메소드의 매개변수의 갯수나 타입이 다르면 문제 없으므로)
