import java.util.*;
public class J_0708_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수?:");
		int count = sc.nextInt();
		J_0708_dto[] dtos =  new J_0708_dto[count];
		String name;
		int kor, eng, mat, total;

		for(int i=0; i < dtos.length; i++) {
			System.out.print("성명:");
			name = sc.next();
			System.out.print("국어:");
			kor = sc.nextInt();
			System.out.print("영어:");
			eng = sc.nextInt();
			System.out.print("수학:?");
			mat = sc.nextInt();

			//오버로딩
			J_0708_dto dto = new J_0708_dto(name,kor,eng,mat);
			//dto.setName(name);
			//dto.setKor(kor);
			//dto.setEng(eng);
			//dto.setMat(mat);
			dto.setTotal(kor+eng+mat); //가능
			dtos[i] = dto;
		}
		for(int i = 0;  i < dtos.length; i++ ) {
			total = dtos[i].setKor() + dtos[i].setEng() + dtos[i].setMat();
			System.out.println((i+1)+"번째 :" +dtos[i].getName()+"입니다."+"\t");
			System.out.println((i+1)+"번째 :" +dtos[i].setKor()+"입니다."+"\t");
			System.out.println((i+1)+"번째 :" +dtos[i].setEng()+"입니다."+"\t");
			System.out.println((i+1)+"번째 :" +dtos[i].setMat()+"입니다."+"\t");
			System.out.print((i+1)+"번째 :"+total+"입니다."+"\n");

		}

	}

}
