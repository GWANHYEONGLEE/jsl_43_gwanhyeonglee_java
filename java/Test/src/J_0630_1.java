import java.util.Scanner;
public class J_0630_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] point = new String[6];
		System.out.print("����?");
		point[0] = sc.next();
		System.out.print("���� ����?");
		point[1] = sc.next();
		System.out.print("���� ����?");
		point[2] = sc.next();
		System.out.print("���� ����?");
		point[3] = sc.next();
		System.out.print("����?");
		point[4] = sc.next();
		System.out.print("���?");
		point[5] = sc.next();

		int total = Integer.parseInt(point[1])+
				    Integer.parseInt(point[2])+
				    Integer.parseInt(point[3]);
		point[4] = Integer.toString(total);
		point[5] = Integer.toString(total / 3);

		for(int k=0 ; k < point.length; k++) {
			System.out.println(point[k]);
		}

		/*
		String a = "20";
		int b = 40;

		 int c = Integer.parseInt(a); // String��  int ��
		 String s = Integer.toString(b);//int��  String ����
		*/
	}

}


