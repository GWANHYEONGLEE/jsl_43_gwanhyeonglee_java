import java.util.Scanner;
public class J_0624 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int milk = 1200;
		int cola = 1100;
		int runch = 4000;
		int age = 0;
		double total = 0;
		System.out.print("��ǰ: ����:1, �ݶ�:2, ���ö�:3, ����?");
		int pro = sc.nextInt();
		System.out.print("����: ����:1, �߱�:2, �����:3, ����?");
		String area = sc.next();
		System.out.print("����? ");
		int amount = sc.nextInt();
		if(pro == 1 || pro == 3) {
			System.out.print("���� ?");
			age = sc.nextInt();

		}
		System.out.print("����? ");

		if(pro == 1) {
			if(age <= 13)  total = (milk * 0.8) * amount;
			else  total = milk * amount;
		}else if(pro == 2) {
			total = cola * amount;
		}else if(pro == 3) {
			if(age <= 55)  total = (milk * 0.7) * amount;
			else total = runch * amount;
		}
		if(area.equals("�߱�")) total = total * 0.95;
		if(area.equals("�����")) total = total * 0.90;

		System.out.print("�� �ݾ� : "+ (int)total+"�Դϴ�.");

}
}
