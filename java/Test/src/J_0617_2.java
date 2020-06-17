import java.util.Scanner;
public class J_0617_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basic = 5000;
		int total = 0;

		System.out.println("초딩은 1번 선택해라 \n중딩은 2번 선택해라 \n고딩은 3번 선택해라 \n대딩은 4번 선택해라 \n입력:");
		int cho =sc.nextInt();

		System.out.print("남자는 1번 선택해라\n여자는 2번 선택해라\n입력");
		int mf =sc.nextInt();


		if(cho==1) {
			total = basic;
		} else if(cho==2) {
			total = basic + 2000;
		} else if(cho==3) {
			total = basic + 3000;
			if(mf ==2) {
				total += 3000;
			}
		} else if(cho==4) {
			total = basic + 5000;
			if(mf == 2) total = total + 5000;
		}
		System.out.print("너희들의 용돈은"+total+"입니다");
	}

}
