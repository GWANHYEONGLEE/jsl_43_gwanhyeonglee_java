import java.util.Scanner;
public class J_0626_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �ܺ���?");
		int start = sc.nextInt();
		System.out.println("�� �ܺ���?");
		int end = sc.nextInt();

		for(int k=start; k <= end; k++){
		  for(int a=1; a < 9;a++){
			  System.out.println(k+" X "+a+" = "+ k*a);
		  }
		}
	}

}
