import java.util.*;
public class J_0713 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		J_0713_dto[] dtos = new J_0713_dto[3];

		dtos[0] = new J_0713_dto("홍길동","대전",30);
		dtos[1] = new J_0713_dto("김홍만","금산",20);
		dtos[2] = new J_0713_dto("이재명","대구",35);

		for(int i=0; i < dtos.length; i++) {
			System.out.print(dtos[i].getName()+"\t");
			System.out.print(dtos[i].getArea()+"\t");
			System.out.print(dtos[i].getAge()+"\n");
		}
		System.out.println("--------------------------------");
		for(int i=0; i <dtos.length; i++) {
			if(	dtos[i].getArea().indexOf("대전") != -1) {
				System.out.print(dtos[i].getName()+"\t");
				System.out.print(dtos[i].getArea()+"\t");
				System.out.print(dtos[i].getAge()+"\n");
			}
		}
	System.out.println("=========================================");
	int q =0;
	do {
		System.out.print("검색이름 :1, 지역:2, 종료:0 ?");
		q = sc.nextInt();
		if(q==1){
			System.out.print(" 이름 ? ");
			String name = sc.next();
			for(int i=0; i <dtos.length; i++) {
				if(	dtos[i].getName().indexOf(name) != -1) {
					System.out.print(dtos[i].getName()+"\t");
					System.out.print(dtos[i].getArea()+"\t");
					System.out.print(dtos[i].getAge()+"\n");
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
	}while(q != 0);
	System.out.println("==================끝=====================");

	}
}

