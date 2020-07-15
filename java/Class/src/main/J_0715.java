package main;

import java.util.ArrayList;
import java.util.Scanner;

import dao.J0715_dao;
import dto.J_0715_dto;
public class J_0715 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<J_0715_dto> arr = new ArrayList<>();
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
			double eva = dao.getAva(total,3);

			J_0715_dto dto = new J_0715_dto(name, kor, eng, mat, total, eva);
			arr.add(dto);
		}
		for(int i=0; i < arr.size(); i++) {
			System.out.print(arr.get(i).getName()+"\t");
			System.out.print(arr.get(i).getKor()+"\t");
			System.out.print(arr.get(i).getEng()+"\t");
			System.out.print(arr.get(i).getMat()+"\t");
			System.out.print(arr.get(i).getTotal()+"\t");
			System.out.print(arr.get(i).getEva()+"\n");
		}
		sc.close();
	}
}

