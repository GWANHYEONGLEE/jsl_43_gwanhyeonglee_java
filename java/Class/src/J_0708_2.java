import java.util.*;
public class J_0708_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J_0708_dto[] dtos =  new J_0708_dto[2];

		for(int i = 0; i < dtos.length; i++ ) {
			System.out.print("����:");
			String name = sc.next();
			System.out.print("����:");
			int kor = sc.nextInt();
			System.out.print("����:");
			int eng = sc.nextInt();
			System.out.print("����:?");
			int mat = sc.nextInt();

			J_0708_dto dto = new J_0708_dto();// dto�� ���� �־��ش�.
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMat(mat);  //�迭�� �־��ش�.
			dtos[i] = dto;
		}
		for(int i = 0; i <dtos.length; i++) {
			int total = dtos[i].setKor() + dtos[i].setEng() + dtos[i].setMat();
			System.out.println((i+1)+"��° :" +dtos[i].getName()+"�Դϴ�."+"\t");
			System.out.println((i+1)+"��° :" +dtos[i].setKor()+"�Դϴ�."+"\t");
			System.out.println((i+1)+"��° :" +dtos[i].setEng()+"�Դϴ�."+"\t");
			System.out.println((i+1)+"��° :" +dtos[i].setMat()+"�Դϴ�."+"\t");
			System.out.print((i+1)+"��° :"+total+"�Դϴ�."+"\n");
		}
	}

}
