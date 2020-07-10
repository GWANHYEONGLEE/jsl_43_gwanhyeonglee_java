import java.util.*;
public class J_0710 {

	public static void main(String[] args) { //	첫벗째 방법
		Scanner sc = new Scanner(System.in);
		System.out.print("몇명?:");
		int count = sc.nextInt();

		J_0710_dto[] dtos =  new J_0710_dto[count];
		//String name, area;
		//int age;
		//J_0710_dto dto;
		for(int i=0; i < count; i++) {
			System.out.print("성명:"); // ex) 홍길동
			String name = sc.next();
			System.out.print("지역:"); // ex) 대전
			String area = sc.next();
			System.out.print("나이:"); // ex) 20
			int age = sc.nextInt();
			J_0710_dto dto  = new J_0710_dto(name,area,age);
			dtos[i] =dto;
		}
		for(int i=0; i < dtos.length; i++) {
			System.out.print((i+1)+"번째 :"+ dtos[i].getName()+"\t");
			System.out.print(dtos[i].getArea()+"\t");
			System.out.print(dtos[i].getAge()+"\n");
		}


	}

	}
