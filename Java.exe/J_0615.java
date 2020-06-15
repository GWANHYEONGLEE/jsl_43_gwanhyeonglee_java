import java.util.Scanner;
class J_0615{
     public static void main(String[] args){
		 J_0615_sub sub = new J_0615_sub();
		Scanner sc = new Scanner(System.in);

        System.out.print(" 성 명? ");
        String name = sc.next();
		System.out.print(" 당신의 국어 점수는? ");
		int kor = sc.nextInt();
		System.out.print(" 당신의 수학 점수는? ");
		int mat = sc.nextInt();
        System.out.print(" 당신의 영어 점수는? ");
		int eng = sc.nextInt();


	//	int total = kor + mat + eng;
		int total = sub.sum3(kor, mat, eng);
		int avag = sub.ava(total, 3);

		System.out.println(name+"님 총점:"+total+"점 입니다.");
		System.out.println(name+"님 평균:"+avag+"점 입니다.");

	 }
    }
