import java.util.Scanner;
class J_0612_1{
     public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print(" 당신의 이름은?");
        String name = sc.next();
		System.out.println(" 당신의 이름은"+name+"입니다");

		System.out.print(" 당신의 국어 점수는? ");
		int kor = sc.nextInt();
		System.out.print(" 당신의 수학 점수는? ");
		int mat = sc.nextInt();

		int total = kor + mat;
		System.out.print(name+":님의 총점"+total+":입니다");

	 }
    }
