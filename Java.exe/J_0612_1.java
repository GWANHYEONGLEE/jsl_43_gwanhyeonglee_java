import java.util.Scanner;
class J_0612_1{
     public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print(" ����� �̸���?");
        String name = sc.next();
		System.out.println(" ����� �̸���"+name+"�Դϴ�");

		System.out.print(" ����� ���� ������? ");
		int kor = sc.nextInt();
		System.out.print(" ����� ���� ������? ");
		int mat = sc.nextInt();

		int total = kor + mat;
		System.out.print(name+":���� ����"+total+":�Դϴ�");

	 }
    }
