import java.util.*;
public class J_0708_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J_0708_dto[] dtos =  new J_0708_dto[2];

		for(int i = 0; i < dtos.length; i++ ) {
			System.out.print("성명:");
			String name = sc.next();
			System.out.print("국어:");
			int kor = sc.nextInt();
			System.out.print("영어:");
			int eng = sc.nextInt();
			System.out.print("수학:?");
			int mat = sc.nextInt();

			J_0708_dto dto = new J_0708_dto();// dto에 값을 넣어준다.
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);  //배열에 넣어준다.
			dtos[i] = dto;
		}
		for(int i = 0; i <dtos.length; i++) {
			int total = dtos[i].setKor() + dtos[i].setEng() + dtos[i].setMat();
			System.out.println((i+1)+"번째 :" +dtos[i].getName()+"입니다."+"\t");
			System.out.println((i+1)+"번째 :" +dtos[i].setKor()+"입니다."+"\t");
			System.out.println((i+1)+"번째 :" +dtos[i].setEng()+"입니다."+"\t");
			System.out.println((i+1)+"번째 :" +dtos[i].setMat()+"입니다."+"\t");
			System.out.print((i+1)+"번째 :"+total+"입니다."+"\n");
		}
	}

}
