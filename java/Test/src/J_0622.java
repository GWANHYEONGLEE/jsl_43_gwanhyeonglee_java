import java.util.Scanner;

public class J_0622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = 3;

		System.out.print("성명 ? :");
		String name = sc.next();
		System.out.print("국어 ? :");
		int kor = sc.nextInt();
		System.out.print("수학 ? :");
		int mat = sc.nextInt();
		System.out.print("영어 ? :");
		int eng = sc.nextInt();

		int avg = (kor + mat + eng) / c;

		if((avg >= 85 && kor >= 90)|| mat == 100) {
			System.out.print("합격");
		}else {
			System.out.print("불합격");
		}
	}

}
