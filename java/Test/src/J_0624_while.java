import java.util.Scanner;
public class J_0624_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//while�� ������

		int a = 1;
		System.out.print("�� �� ?");
		int dan = sc.nextInt();
		while(a <= 9) {
			System.out.println(dan+" * "+ a +" = "+ dan * a);
			a++;
		}

		}
	}


