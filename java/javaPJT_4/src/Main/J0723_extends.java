package Main;

public class J0723_extends {

	public static void main(String[] args) {
		J0723_child child = new J0723_child(); //�ڽ� Ŭ���� ���� child��
											   //2���� �޼��带 ����������.
		child.childPrint();
		child.parentsPrint();              //�θ�Ŭ���� <<< �ڽ�Ŭ����
	}

}
