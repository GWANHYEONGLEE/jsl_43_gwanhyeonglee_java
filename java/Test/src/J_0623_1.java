import java.util.Scanner;
public class J_0623_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수: ");
		int a = sc.nextInt();
		System.out.println("연산자 입력(+ - * /) : ");
		String gubun = sc.next();
		System.out.println("두 번째 수: ");
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
		System.out.print("결과 : "+ a +" "+gubun+" "+ b +" = "+result);







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
		if(go.contentEquals("n")) System.out.println("잘못된 연산자 입력");
		else System.out.print("결과 : "+ a +" "+gubun+" "+ b +" = "+result);
	*/
	}

}
