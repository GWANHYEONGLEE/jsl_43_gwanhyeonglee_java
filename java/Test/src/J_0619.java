import java.util.Scanner;
public class J_0619 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int basic = 5000;
		int total = 0;
		System.out.print("�� ��?");
		String name =sc.next();

		System.out.print(" ���� ?: ��1 ��2\n �Է�:");
		int sex = sc.nextInt();
		if(sex==1) {
			if(sex==2) {
				total = basic + 2000;
			}
		}

		System.out.print(" ����?: ����1 ����2\n �Է�:");
		int army = sc.nextInt();
		if(army==2) {
			if(army==1) {
				total = basic + 3000;
			}
		}

		System.out.print(" ��ȥ?: ��ȥ1 ��ȥ2\n �Է�:");
		int marry = sc.nextInt();
		if(marry==2) {
			if(marry==1) {
				total = basic + 4000;
			}
		}

		System.out.print(name+"���� �ϴ���"+total+"�Դϴ�.");
	}
}
