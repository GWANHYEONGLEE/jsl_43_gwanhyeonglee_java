
import java.util.Scanner;
public class J_0617{

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print(" ���� �Է� ");
		 int point = sc.nextInt();

		 if(point > 80) {
			 System.out.print("��");
		 }else {
			 if(point > 60) {
				 System.out.print("��");
			 }else {
				 if(point > 50) {
					 System.out.print("��");
				 }else {
					 System.out.print("��");
				 }
			 }
		 }

    }
}

