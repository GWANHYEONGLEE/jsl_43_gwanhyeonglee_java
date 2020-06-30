import java.util.Scanner;
public class J_0630 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 System.out.println("몇개 질문");
		 int count = sc.nextInt();

		 String[] question = new String[count];
		 String[] answer = new String[count];

		 for(int k=0; k < question.length ; k++) {
			 System.out.print((k+1)+"번째 질문 내용:");
			 question[k] = sc.next();

		 }

		 for( int k=0; k < question.length ; k++) {
			 System.out.println((k+1)+ ". " +question[k]+"  ? ");
			 question[k] = sc.next();
		 }

		 for(int k=0; k < question.length; k++) {
			 System.out.println((k+1)+"."+question[k]+" : "+answer[k]);
		 }
	}

}
