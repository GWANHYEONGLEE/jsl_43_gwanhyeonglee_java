import java.util.Scanner;
public class J_0618_switch_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է�:");
		int txt = sc.nextInt();

		String t1;

		switch(txt) {
			case 1:
				System.out.println(" txt: "+txt);
				break;
			case 2:
				System.out.println(" txt:"+txt);
				break;
			case 3:
				System.out.println(" txt:"+txt);
				break;

			default :
				System.out.println(" ������ �����");
				break;
		   }

		if(txt ==1 ) {
			t1 = "a";
			System.out.print(" txt: "+t1);
		}else if(txt == 2) {
			t1 ="b";
			System.out.print(" txt: "+t1);
		}else if(txt == 3) {
			t1 ="c";
			System.out.print(" txt: "+t1);

		  }else System.out.print("������ ��� ���");
	   }
   }
