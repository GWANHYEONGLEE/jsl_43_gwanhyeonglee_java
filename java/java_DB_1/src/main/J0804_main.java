package main;
import java.util.Scanner;
import dao.J0804_dao;
import dto.J0804_dto;

public class J0804_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0804_dao dao = new J0804_dao();

		int gubun = 0;
		do {
			System.out.print(" �˻�:1, ���:2, ����:0 ? ");
			gubun = sc.nextInt();
			if(gubun == 1) {

			}else if(gubun == 2) {
				System.out.println(" ���(no) ? : ");
				String no = sc.next();

				System.out.println(" ���� ? : ");
				String name = sc.next();

				System.out.println(" �����ڵ� ? : ����[10], ����[20], �λ�[30] ?  ");
				String area = sc.next();

				System.out.println(" ���� ? : ");
				int age = sc.nextInt();
				int result = dao.saveMember(no, name, area, age);

			//	J0804_dto dto = new J0804_dto(no, name, area, age);
			//	int rs = dao.saveMember(dto); //�����ε�


				if(result == 1) {
					System.out.println("��� �Ǿ����ϴ�.");
				}else {
					System.out.println("��Ͻ���.");
				}
			}
		}while(gubun != 0);
		System.out.print("===============����=================");
	}
}
