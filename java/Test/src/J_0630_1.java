import java.util.Scanner;
public class J_0630_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] point = new String[6];
		System.out.print("성명?");
		point[0] = sc.next();
		System.out.print("국어 점수?");
		point[1] = sc.next();
		System.out.print("수학 점수?");
		point[2] = sc.next();
		System.out.print("영어 점수?");
		point[3] = sc.next();
		System.out.print("총점?");
		point[4] = sc.next();
		System.out.print("평균?");
		point[5] = sc.next();

		int total = Integer.parseInt(point[1])+
				    Integer.parseInt(point[2])+
				    Integer.parseInt(point[3]);
		point[4] = Integer.toString(total);
		point[5] = Integer.toString(total / 3);

		for(int k=0 ; k < point.length; k++) {
			System.out.println(point[k]);
		}

		/*
		String a = "20";
		int b = 40;

		 int c = Integer.parseInt(a); // String을  int 로
		 String s = Integer.toString(b);//int를  String 으로
		*/
	}

}


