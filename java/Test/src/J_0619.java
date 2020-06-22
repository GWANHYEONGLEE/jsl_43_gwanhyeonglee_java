import java.util.Scanner;
public class J_0619 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int basic = 5000;
		int total = 0;
		System.out.print("성 명?");
		String name =sc.next();

		System.out.print(" 성별 ?: 여1 남2\n 입력:");
		int sex = sc.nextInt();
		if(sex==1) {
			if(sex==2) {
				total = basic + 2000;
			}
		}

		System.out.print(" 남자?: 군필1 미필2\n 입력:");
		int army = sc.nextInt();
		if(army==2) {
			if(army==1) {
				total = basic + 3000;
			}
		}

		System.out.print(" 결혼?: 기혼1 미혼2\n 입력:");
		int marry = sc.nextInt();
		if(marry==2) {
			if(marry==1) {
				total = basic + 4000;
			}
		}

		System.out.print(name+"님의 일당은"+total+"입니다.");
	}
}
