
import java.util.Scanner;
public class J_0617{

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print(" 점수 입력 ");
		 int point = sc.nextInt();

		 if(point > 80) {
			 System.out.print("수");
		 }else {
			 if(point > 60) {
				 System.out.print("우");
			 }else {
				 if(point > 50) {
					 System.out.print("미");
				 }else {
					 System.out.print("양");
				 }
			 }
		 }

    }
}

