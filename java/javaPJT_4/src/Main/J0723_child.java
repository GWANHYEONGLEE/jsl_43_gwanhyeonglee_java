package Main;

public class J0723_child extends J0723_parents{
	public J0723_child() {
		System.out.println("J0723_child ������");

	}
	@Override
	public void parentsPrint() {
		System.out.println("child~~~print~~");
	}
	public void childPrint() {
		System.out.println("J0723_child~~");
	}
}
//Override �� �θ� Ŭ������ �żҵ带 �ڽ� Ŭ�������� �������� ������ ǥ��
//Overloading �� �� Ŭ���� �ȿ��� ���� �޼ҵ� �̸�, ���� Ÿ���� �޼ҵ带 ����ϰ� ������ ǥ��(�޼ҵ��� �Ű������� ������ Ÿ���� �ٸ��� ���� �����Ƿ�)
