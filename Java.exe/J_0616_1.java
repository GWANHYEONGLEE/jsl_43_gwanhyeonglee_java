import java.util.Scanner;
class J_0616_1{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print(" 점수입력? ");
		int a = sc.nextInt();

		if ( a > 80 ){
			System.out.println("합격");
		}
		else  {
			System.out.print("불합격");
		}
	}
}
