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
			System.out.print(" 검색:1, 등록:2, 종료:0 ? ");
			gubun = sc.nextInt();
			if(gubun == 1) {

			}else if(gubun == 2) {
				System.out.println(" 사번(no) ? : ");
				String no = sc.next();

				System.out.println(" 성명 ? : ");
				String name = sc.next();

				System.out.println(" 지역코드 ? : 서울[10], 대전[20], 부산[30] ?  ");
				String area = sc.next();

				System.out.println(" 나이 ? : ");
				int age = sc.nextInt();
				int result = dao.saveMember(no, name, area, age);

			//	J0804_dto dto = new J0804_dto(no, name, area, age);
			//	int rs = dao.saveMember(dto); //오버로딩


				if(result == 1) {
					System.out.println("등록 되었습니다.");
				}else {
					System.out.println("등록실패.");
				}
			}
		}while(gubun != 0);
		System.out.print("===============종료=================");
	}
}
