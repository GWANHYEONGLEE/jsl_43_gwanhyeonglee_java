import java.util.Scanner;
public class J_0617_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basic = 5000;
		int total = 0;

		System.out.println("�ʵ��� 1�� �����ض� \n�ߵ��� 2�� �����ض� \n����� 3�� �����ض� \n����� 4�� �����ض� \n�Է�:");
		int cho =sc.nextInt();

		System.out.print("���ڴ� 1�� �����ض�\n���ڴ� 2�� �����ض�\n�Է�");
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
		System.out.print("������� �뵷��"+total+"�Դϴ�");
	}

}
