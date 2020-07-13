import java.util.*;
public class J_0713_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명입니까?:");
		int count = sc.nextInt();

		J_0713_dto[] dtos = new J_0713_dto[count];
		for(int i=0; i < count; i++) {
			System.out.print("성명? :");
			String name = sc.next();
			System.out.print("지역? :");
			String area = sc.next();
			System.out.print("나이? :");
			int age = sc.nextInt();

			J_0713_dto dto = new J_0713_dto(name, area, age);
			dtos[i] =dto;
		}
		for(int i=0; i<dtos.length; i++) {
			System.out.println(dtos[i].getName()+"\t");
			System.out.println(dtos[i].getArea()+"\t");
			System.out.println(dtos[i].getAge()+"\t");
		}
		System.out.print("===================================================");
		int q = 0;

		do {
			System.out.print("검색이름 :1, 지역:2 , 나이:3,  종료:0 ?");
			q = sc.nextInt();
			if(q==1){
			String name = sc.next();
			System.out.print("이름?");
			for(int i = 0; i < dtos.length; i++) {
				if(	dtos[i].getName().indexOf(name) != -1) {
				System.out.println(dtos[i].getName()+"\t");
				System.out.println(dtos[i].getArea()+"\t");
				System.out.println(dtos[i].getAge()+"\t");
			}
			}
			}
		if(q == 2) {
			System.out.print(" 지역? ");
			String area = sc.next();
			for(int i=0; i <dtos.length; i++) {
				if(	dtos[i].getArea().indexOf(area) != -1) {
					System.out.print(dtos[i].getName()+"\t");
					System.out.print(dtos[i].getArea()+"\t");
					System.out.print(dtos[i].getAge()+"\n");
				}
			}
		}
		if(q ==3) {
			System.out.print(" 몇살부터 ? ");
			int startAge = sc.nextInt();
			System.out.print(" 몇살까지 ? ");
			int endAge = sc.nextInt();
			for(int i = 0; i<dtos.length; i++) {
				if(dtos[i].getAge() >= startAge && dtos[i].getAge() <= endAge) {
					System.out.print(dtos[i].getName()+"\t");
					System.out.print(dtos[i].getArea()+"\t");
					System.out.print(dtos[i].getAge()+"\n");
				}
			}

		}
		}while(q != 0);
		System.out.println("=====================종료======================");
	}
}
