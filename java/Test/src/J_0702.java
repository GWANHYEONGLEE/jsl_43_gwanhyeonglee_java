import java.util.Scanner;
public class J_0702 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;
		int ava = 0;

		System.out.print("����?");
		String name = sc.next();

		String[] point = {"����","����","����","����"};
		String[] a = new String[point.length];

		for(int i = 0 ; i < point.length; i++) {
			System.out.print(point[i] + " ����?");
			a[i] = sc.next();
			total += Integer.parseInt(a[i]);
		}
		ava = total/point.length;



		System.out.print("����\t");
		for(int i = 0; i < point.length; i++) {
			System.out.print(point[i]+"\t");
		}
		System.out.print("����\t���");


		System.out.print("\n");


		System.out.print(name + "\t");
		for(int i = 0; i < point.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.print(total + "\t" + ava);


	}

}
