package main;
import java.util.ArrayList;
import java.util.Scanner;
import dto.J0716_1_dto;
import dao.J0716_1_dao;

public class J0716_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<J0716_1_dto> arr = new ArrayList<>();
		J0716_1_dao dao = new J0716_1_dao();
		System.out.print("몇 명? :");
		int count = sc.nextInt();
		for(int i=0; i < count; i++) {
			System.out.print("성명? :");
			String name = sc.next();
			System.out.print("국 어? :");
			int kor = sc.nextInt();
			System.out.print("영어? :");
			int eng = sc.nextInt();

		int total = dao.getTotal(kor, eng);
		String ava = dao.getAva(total, 2);
		String result = dao.getResult(ava);


		arr.add(new J0716_1_dto(name, ava ,result, kor, eng, total));
	}
	for(int i=0; i < arr.size(); i++) {
		System.out.print(arr.get(i).getName()+"\t");
		System.out.print(arr.get(i).getAva()+"\t");
		System.out.print(arr.get(i).getResult()+"\t");
		System.out.print(arr.get(i).getKor()+"\t");
		System.out.print(arr.get(i).getEng()+"\t");
		System.out.print(arr.get(i).getTotal()+"\t");

	}
	sc.close();
	}
}
