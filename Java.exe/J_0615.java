import java.util.Scanner;
class J_0615{
     public static void main(String[] args){
		 J_0615_sub sub = new J_0615_sub();
		Scanner sc = new Scanner(System.in);

        System.out.print(" �� ��? ");
        String name = sc.next();
		System.out.print(" ����� ���� ������? ");
		int kor = sc.nextInt();
		System.out.print(" ����� ���� ������? ");
		int mat = sc.nextInt();
        System.out.print(" ����� ���� ������? ");
		int eng = sc.nextInt();


	//	int total = kor + mat + eng;
		int total = sub.sum3(kor, mat, eng);
		int avag = sub.ava(total, 3);

		System.out.println(name+"�� ����:"+total+"�� �Դϴ�.");
		System.out.println(name+"�� ���:"+avag+"�� �Դϴ�.");

	 }
    }
