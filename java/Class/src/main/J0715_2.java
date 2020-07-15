package main;
import java.util.ArrayList;
import java.util.Scanner;
import dto.J0715_2_dto;
import dao.J0715_dao;

public class J0715_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<J0715_2_dto> arr = new ArrayList<>();
		J0715_dao dao = new J0715_dao();
		System.out.print("몇명? : ");
		int count = sc.nextInt();
		for(int i=0; i < count; i++) {
			System.out.print("성명? :");
			String name = sc.next();
			System.out.print("국어? :");
			int kor = sc.nextInt();
			System.out.print("영어? :");
			int eng = sc.nextInt();
			System.out.print("수학? :");
			int mat = sc.nextInt();

			int total = dao.getTotal(kor, eng, mat);
			double eva = dao.getAva(total, 3);
			String result = dao.getResult(eva);

			 arr.add(new J0715_2_dto(name, result, kor, eng, mat, total, eva));



		}
		for(int i=0; i < arr.size(); i++) {
			System.out.print(arr.get(i).getName()+"\t");
			System.out.print(arr.get(i).getKor()+"\t");
			System.out.print(arr.get(i).getEng()+"\t");
			System.out.print(arr.get(i).getMat()+"\t");
			System.out.print(arr.get(i).getTotal()+"\t");
			System.out.print(arr.get(i).getAva()+"\t");
			System.out.print(arr.get(i).getResult()+"\n");
		}
		sc.close();
	}
}


