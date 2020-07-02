import java.util.Scanner;
public class J_0702 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;
		int ava = 0;

		System.out.print("성명?");
		String name = sc.next();

		String[] point = {"국어","영어","수학","과학"};
		String[] a = new String[point.length];

		for(int i = 0 ; i < point.length; i++) {
			System.out.print(point[i] + " 점수?");
			a[i] = sc.next();
			total += Integer.parseInt(a[i]);
		}
		ava = total/point.length;



		System.out.print("성명\t");
		for(int i = 0; i < point.length; i++) {
			System.out.print(point[i]+"\t");
		}
		System.out.print("총점\t평균");


		System.out.print("\n");


		System.out.print(name + "\t");
		for(int i = 0; i < point.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.print(total + "\t" + ava);


	}

}
