import java.util.Scanner;
public class J_0623_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ��: ");
		int a = sc.nextInt();
		System.out.println("������ �Է�(+ - * /) : ");
		String gubun = sc.next();
		System.out.println("�� ��° ��: ");
		int b = sc.nextInt();

		int result = 0;
		switch(gubun) {
			case "+":
			     result = a + b;
			     break;
			case "-":
			     result = a - b;
			     break;
			case "*":
			     result = a * b;
			     break;
			case "/":
			     result = a / b;
			     break;
		}
		System.out.print("��� : "+ a +" "+gubun+" "+ b +" = "+result);







		/*
		String go = "y";
		if(gubun.equals("+")) {
			result = a + b;
		}else if(gubun.equals("-")) {
			result = a - b;
		}else if(gubun.equals("*")) {
			result = a * b;
		}else if(gubun.equals("/")) {
			result = a / b;
		} else {
			go ="n";
		}
		if(go.contentEquals("n")) System.out.println("�߸��� ������ �Է�");
		else System.out.print("��� : "+ a +" "+gubun+" "+ b +" = "+result);
	*/
	}

}
