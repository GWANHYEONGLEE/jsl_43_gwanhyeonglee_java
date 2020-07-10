import java.util.*;
public class J_0710_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇명입니까?");
		int count = sc.nextInt();

		J_0710_dto_2[] dtos = new J_0710_dto_2[count];
		for(int i=0; i < count; i++) {
			System.out.print("성명?:");
			String name = sc.next();
			System.out.print("국어?:");
			int kor = sc.nextInt();
			System.out.print("영어?:");
			int eng = sc.nextInt();
			System.out.print("수학?:");
			int mat = sc.nextInt();

			J_0710_dto_2 dto = new J_0710_dto_2(name, kor, eng, mat);
			dtos[i] =dto;
		}

		for(int i=0; i < dtos.length; i++) {
			System.out.print((i+1)+"번째 : "+dtos[i].getName()+"\t");
			System.out.print(dtos[i].getKor()+"\t");
			System.out.print(dtos[i].getEng()+"\t");
			System.out.print(dtos[i].getMat()+"\t");
			System.out.print(dtos[i].getTotal()+"\n");
		}

		int a = 0;
		do {
			System.out.print("이름 검색? 1:검색 , 0:종료");
			a=sc.nextInt();
			if(a == 1) {
				System.out.print("검색 이름 입력 ?");
				String search = sc.next();

				for(int i=0; i < dtos.length; i++) {
					if(dtos[i].getName().indexOf(search) !=-1) { //-1이 아니면 있다

					System.out.print((i+1)+"번째 : "+dtos[i].getName()+"\t");
					System.out.print(dtos[i].getKor()+"\t");
					System.out.print(dtos[i].getEng()+"\t");
					System.out.print(dtos[i].getMat()+"\t");
					System.out.print(dtos[i].getTotal()+"\n");
				 }
		      }

			}
		}while(a != 0);  // 0을 누르면 종료시킨다.



	}

}
