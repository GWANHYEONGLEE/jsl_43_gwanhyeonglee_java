import java.util.*;
public class J_0701 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;

		System.out.print("몇과목 : ?");
		int num = sc.nextInt();
		String[] arraynum = new String[num+3];

		System.out.print("성명 : ?");
		arraynum[0] = sc.next();

		for(int i = 1; i <= arraynum.length-3; i++) {
			System.out.print("점수 : ?");
			arraynum[i] = sc.next();
			total += Integer.parseInt(arraynum[i]);
			arraynum[i].toString();
		}

		arraynum[arraynum.length-2] = Integer.toString(total);
		arraynum[arraynum.length-1] = Integer.toString(total/num);

		for(int i = 0; i<arraynum.length; i++) {
			System.out.print(arraynum[i] + " ");
		}

	}

}
