package Main;
import java.io.IOException;
import java.util.Scanner;

public class J0727_exception {
	public static void main(String[] args) {
		J0727_2 ex = new J0727_2();
		Scanner sc = new Scanner(System.in);

		try {
			System.in.read();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.print("첫 번째 점수 ? :");
		String a = sc.next();


		System.out.print("두 번째 점수 ? :");
		String b = sc.next();

		int total = 0;
		try {
			total = ex.getTotal(a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("total : "+total);
	}
}
