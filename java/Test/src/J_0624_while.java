import java.util.Scanner;
public class J_0624_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//while문 구구단

		int a = 1;
		System.out.print("몇 단 ?");
		int dan = sc.nextInt();
		while(a <= 9) {
			System.out.println(dan+" * "+ a +" = "+ dan * a);
			a++;
		}

		}
	}


