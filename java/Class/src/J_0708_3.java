import java.util.*;
public class J_0708_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο���?:");
		int count = sc.nextInt();
		J_0708_dto[] dtos =  new J_0708_dto[count];
		String name;
		int kor, eng, mat, total;

		for(int i=0; i < dtos.length; i++) {
			System.out.print("����:");
			name = sc.next();
			System.out.print("����:");
			kor = sc.nextInt();
			System.out.print("����:");
			eng = sc.nextInt();
			System.out.print("����:?");
			mat = sc.nextInt();

			//�����ε�
			J_0708_dto dto = new J_0708_dto(name,kor,eng,mat);
			//dto.setName(name);
			//dto.setKor(kor);
			//dto.setEng(eng);
			//dto.setMat(mat);
			dto.setTotal(kor+eng+mat); //����
			dtos[i] = dto;
		}
		for(int i = 0;  i < dtos.length; i++ ) {
			total = dtos[i].setKor() + dtos[i].setEng() + dtos[i].setMat();
			System.out.println((i+1)+"��° :" +dtos[i].getName()+"�Դϴ�."+"\t");
			System.out.println((i+1)+"��° :" +dtos[i].setKor()+"�Դϴ�."+"\t");
			System.out.println((i+1)+"��° :" +dtos[i].setEng()+"�Դϴ�."+"\t");
			System.out.println((i+1)+"��° :" +dtos[i].setMat()+"�Դϴ�."+"\t");
			System.out.print((i+1)+"��° :"+total+"�Դϴ�."+"\n");

		}

	}

}
