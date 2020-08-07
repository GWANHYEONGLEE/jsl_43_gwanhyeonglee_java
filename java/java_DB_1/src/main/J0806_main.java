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
			System.out.print("�˻� ���:[1], ���:[2], ����:[3], ���� :[4], ����:[0]");
			gubun = sc.nextInt();
			if(gubun == 1) {
				int searchGubun = 0;
				do {
					System.out.print(" �˻�  => �й�[1], ����[2], ����[0] ?");
					searchGubun = sc.nextInt();
					if(searchGubun == 1) {
						System.out.print("�й� ? ");
						String no = sc.next();
						arr = dao.getScoreList("no", no);
					}else if(searchGubun == 2) {
						System.out.print("����? ");
						String name = sc.next();
						arr = dao.getScoreList("name",name);
					}
					if(searchGubun !=0 ) {
						System.out.println("=======================================");
						System.out.println("�й�\t����\t����\t����\t����\t����\t���");
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
						System.out.println(" �˻� ���� ����");
					}
					System.out.println("============================================");
					}
				}while(searchGubun != 0);


			}else if(gubun == 2) {
				System.out.println(" �й�(no) ? : ");
				String no = sc.next();

				if(no.length() > 4) {
					System.out.println(" �й� 4�ڸ�? ");
					no = sc.next();
				}

				if(no.length() > 4) {
					do {
						System.out.println(" �й� 4�ڸ�? ");
						no = sc.next();
					}while(no.length() > 4);
				}

				System.out.println(" ����(name) ? : ");
				String name = sc.next();

				System.out.println(" ���� ���� ? : "); //---------��� 1------------
				int kor = sc.nextInt();

				if(kor > 100 || kor < 0) {
					do {
						System.out.println(" ������ 0 ~ 100 ?");
						kor = sc.nextInt();
					}while(kor > 100 || kor < 0);
				}

				int eng = 0;                       //----------��� 2--------------
				do {
					System.out.println(" ���� ���� ? : ");
				    eng = sc.nextInt();
				    if(eng > 100 || eng < 0) {
				    	System.out.println(" ���� 0 ~ 100 ����~ ");
				    }
				}while(eng > 100 || eng < 0);


				System.out.println(" ���� ���� ? : ");
				int math = sc.nextInt();

				if(math > 100 || math < 0) {
					do {
						System.out.println(" ������ 0 ~ 100 ����~ ");
						math = sc.nextInt();
					}while(math > 100 || math < 0);
				}

				int total = dao.getTotal(kor, eng, math);
				int ava = dao.getAva(total, 3);
				J0806_dto dto = new J0806_dto(no,name,kor,eng,math,total,ava);
				int result = dao.saveScore(dto);

				if(result == 1) {
					System.out.println("��� �Ǿ����ϴ�.");
				}else {
					System.out.println("��Ͻ���.");
				}

			}else if(gubun == 3) {

			}else if(gubun == 4) {

			}

		}while(gubun != 0);

	}
}
