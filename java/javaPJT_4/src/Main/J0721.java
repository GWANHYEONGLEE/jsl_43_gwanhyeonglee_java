package Main;
//import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import dto.J0721_dto;

public class J0721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<J0721_dto> arr = new ArrayList<>();
		arr.add(new J0721_dto("N001","홍길동","총무","사원",25));
		arr.add(new J0721_dto("N002","안산동","인사","대리",35));
		arr.add(new J0721_dto("N003","김이수","총무","사원",28));

		for(int i=0; i < arr.size(); i++) {
			System.out.print(arr.get(i).getNo()+"\t");
			System.out.print(arr.get(i).getName()+"\t");
			System.out.print(arr.get(i).getDepart()+"\t");
			System.out.print(arr.get(i).getPosition()+"\t");
			System.out.print(arr.get(i).getAge()+"\n");
		}
		System.out.println("-----------------------------------");
		System.out.println("이름 검색:1 , 부서 검색:2 , 정보 수정:3       선택 ? :");
		int gubun = sc.nextInt();


		if(gubun == 1) {
			System.out.print("검색 이름? :");
			String search = sc.next();

			for(int i=0; i < arr.size(); i++) {
				if(arr.get(i).getName().indexOf(search) != -1) { //indexOf
					System.out.print(arr.get(i).getNo()+"\t");
					System.out.print(arr.get(i).getName()+"\t");
					System.out.print(arr.get(i).getDepart()+"\t");
					System.out.print(arr.get(i).getPosition()+"\t");
					System.out.print(arr.get(i).getAge()+"\n");
				}
			}
			System.out.println("-----------이름 검색 종료---------------");


		}else if(gubun == 2) {
			System.out.print("부서 이름? :");
			String search = sc.next();
			for(int i=0; i < arr.size(); i++) {
				 if(arr.get(i).getDepart().indexOf(search) != -1) {
					System.out.print(arr.get(i).getNo()+"\t");
					System.out.print(arr.get(i).getName()+"\t");
					System.out.print(arr.get(i).getDepart()+"\t");
					System.out.print(arr.get(i).getPosition()+"\t");
					System.out.print(arr.get(i).getAge()+"\n");
				}
			}
			System.out.println("-----------부서 검색 종료---------------");
		}else if(gubun == 3) {
			System.out.print("수정 사번 ? :");
			String no = sc.next();
			int updateNo = -1;
			for(int i=0; i < arr.size(); i++) {
				if(arr.get(i).getNo().equals(no)) {
					updateNo = i;
					System.out.print(arr.get(i).getNo()+"\t");
					System.out.print(arr.get(i).getName()+"\t");
					System.out.print(arr.get(i).getDepart()+"\t");
					System.out.print(arr.get(i).getPosition()+"\t");
					System.out.print(arr.get(i).getAge()+"\n");
				}
			}
			if(updateNo == -1) {
				System.out.print("--------수정 정보 없음--------");
			}else {
				System.out.print("수정 이름 ? :");
				String name  = sc.next();
				System.out.print("수정 부서명 ? :");
				String depart = sc.next();
				System.out.print("수정 직위명 ? :");
				String position = sc.next();
				System.out.print("수정 나이 ? :");
				int age = sc.nextInt();

				arr.get(updateNo).setNo(no);
				arr.get(updateNo).setName(name);
				arr.get(updateNo).setDepart(depart);
				arr.get(updateNo).setPosition(position);
				arr.get(updateNo).setAge(age);

				for(int i=0; i < arr.size(); i++) {
						System.out.print(arr.get(i).getNo()+"\t");
						System.out.print(arr.get(i).getName()+"\t");
						System.out.print(arr.get(i).getDepart()+"\t");
						System.out.print(arr.get(i).getPosition()+"\t");
						System.out.print(arr.get(i).getAge()+"\n");
					}
				System.out.print("-----------------수정 종료-----------------");
			}
		}
	}
}
/*
		DecimalFormat df = new DecimalFormat("0000");
		String a = "KB_0024_A";
		a = a.substring(3, 7);
		int n =Integer.parseInt(a);
		n++; //25
		a = df.format(n);

		//a = Integer.toString(n);
		//if(a.length() == 1) a = "000"+a;
		//if(a.length() == 2) a = "00"+a;
		//if(a.length() == 3) a = "0"+a;

		System.out.println("a :"+a);
		a ="KB_"+a+"_A";
		System.out.println("a :"+a);

/===========================================================
	 *
		String a = "S001-DE";
		a = a.substring(1, 4);
		System.out.println("a :"+a);
		int n = Integer.parseInt(a);
		System.out.println("n :"+n);
		n++; // n = n + 1;
		a = Integer.toString(n);
		if(a.length() == 1) a = "00"+a;
		if(a.length() == 2) a = "0"+a;

		System.out.println("a :"+a);
		a = "S"+a+"-DE";
		System.out.println("a :"+a);
*/


