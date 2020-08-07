package main;
import java.util.ArrayList;
import java.util.Scanner;
import dao.J0806_dao;
import dto.J0806_dto;

public class J0806_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J0806_dao dao = new J0806_dao();
		ArrayList<J0806_dto> arr = new ArrayList<>();
		int gubun =0;
		do {
			System.out.print("검색 사번:[1], 등록:[2], 수정:[3], 삭제 :[4], 종료:[0]");
			gubun = sc.nextInt();
			if(gubun == 1) {
				int searchGubun = 0;
				do {
					System.out.print(" 검색  => 학번[1], 성명[2], 이전[0] ?");
					searchGubun = sc.nextInt();
					if(searchGubun == 1) {
						System.out.print("학번 ? ");
						String no = sc.next();
						arr = dao.getScoreList("no", no);
					}else if(searchGubun == 2) {
						System.out.print("성명? ");
						String name = sc.next();
						arr = dao.getScoreList("name",name);
					}
					if(searchGubun !=0 ) {
						System.out.println("=======================================");
						System.out.println("학번\t성명\t국어\t영어\t수학\t총점\t평균");
						for(int i=0; i<arr.size(); i++) {
							System.out.print(arr.get(i).getNo()+"\t");
							System.out.print(arr.get(i).getName()+"\t");
							System.out.print(arr.get(i).getKor()+"\t");
							System.out.print(arr.get(i).getEng()+"\t");
							System.out.print(arr.get(i).getMat()+"\t");
							System.out.print(arr.get(i).getTotal()+"\t");
							System.out.print(arr.get(i).getAva()+"\n");
					}
					if(arr.size() == 0) {
						System.out.println(" 검색 내용 없음");
					}
					System.out.println("============================================");
					}
				}while(searchGubun != 0);


			}else if(gubun == 2) {
				System.out.println(" 학번(no) ? : ");
				String no = sc.next();

				if(no.length() > 4) {
					System.out.println(" 학번 4자리? ");
					no = sc.next();
				}

				if(no.length() > 4) {
					do {
						System.out.println(" 학번 4자리? ");
						no = sc.next();
					}while(no.length() > 4);
				}

				System.out.println(" 성명(name) ? : ");
				String name = sc.next();

				System.out.println(" 국어 점수 ? : "); //---------방법 1------------
				int kor = sc.nextInt();

				if(kor > 100 || kor < 0) {
					do {
						System.out.println(" 점수는 0 ~ 100 ?");
						kor = sc.nextInt();
					}while(kor > 100 || kor < 0);
				}

				int eng = 0;                       //----------방법 2--------------
				do {
					System.out.println(" 영어 점수 ? : ");
				    eng = sc.nextInt();
				    if(eng > 100 || eng < 0) {
				    	System.out.println(" 점수 0 ~ 100 사이~ ");
				    }
				}while(eng > 100 || eng < 0);


				System.out.println(" 수학 점수 ? : ");
				int math = sc.nextInt();

				if(math > 100 || math < 0) {
					do {
						System.out.println(" 점수는 0 ~ 100 사이~ ");
						math = sc.nextInt();
					}while(math > 100 || math < 0);
				}

				int total = dao.getTotal(kor, eng, math);
				int ava = dao.getAva(total, 3);
				J0806_dto dto = new J0806_dto(no,name,kor,eng,math,total,ava);
				int result = dao.saveScore(dto);

				if(result == 1) {
					System.out.println("등록 되었습니다.");
				}else {
					System.out.println("등록실패.");
				}

			}else if(gubun == 3) {

			}else if(gubun == 4) {

			}

		}while(gubun != 0);

	}
}
