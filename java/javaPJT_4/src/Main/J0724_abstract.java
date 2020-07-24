package Main;

public class J0724_abstract {

	public static void main(String[] args) {
		J0724_child child = new J0724_child();
		int a =child.getTotal(50, 60);


		J0724_parent child2 = new J0724_child_two();
		int b = child2.getAva(100, 2);


	}

}
