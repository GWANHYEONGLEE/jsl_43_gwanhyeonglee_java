package main;
import java.util.ArrayList;
import java.util.Scanner;
import dto.J_0714_2_dto;

public class J_0714_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<J_0714_2_dto> arr = new ArrayList<>();
		System.out.print("몇명? : ");
		int count = sc.nextInt();
		for(int i=0; i < count; i++) {
			System.out.print("성명? :");
			String name = sc.next();
			System.out.print("지역? :");
			String area = sc.next();
			System.out.print("나이? :");
			int age = sc.nextInt();
			//arr.add(new J_0714_2_dto(name,area,age));
			J_0714_2_dto dto = new J_0714_2_dto(name, area, age);
			arr.add(dto);
		}
		for(int i=0; i < arr.size(); i++) {
			System.out.print(arr.get(i).getName()+"\t");
			System.out.print(arr.get(i).getArea()+"\t");
			System.out.print(arr.get(i).getAge()+"\n");
		}
		sc.close();
	}
}
