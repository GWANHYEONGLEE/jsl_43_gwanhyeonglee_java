package main;
import java.util.ArrayList;
import java.util.Scanner;
import dto.J_0714_3_dto;

public class J_0714_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<J_0714_3_dto> arr = new ArrayList<>();
		System.out.print("���? : ");
		int count = sc.nextInt();
		for(int i=0; i < count; i++) {
			System.out.print("����? :");
			String name = sc.next();
			System.out.print("���� ����? :");
			int kor = sc.nextInt();
			System.out.print("���� ����? :");
			int eng = sc.nextInt();
			System.out.print("���� ����? :");
			int mat = sc.nextInt();
			arr.add(new J_0714_3_dto(name,kor,eng ,mat));
		}
		for(int i=0; i < arr.size(); i++) {
			System.out.print(arr.get(i).getName()+"\t");
			System.out.print(arr.get(i).getKor()+"\t");
			System.out.print(arr.get(i).getEng()+"\t");
			System.out.print(arr.get(i).getMat()+"\n");
		}
		sc.close();
	}
}
