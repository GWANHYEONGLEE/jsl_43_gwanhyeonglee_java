import java.util.*;
public class J_0710_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����Դϱ�?");
		int count = sc.nextInt();

		J_0710_dto_2[] dtos = new J_0710_dto_2[count];
		for(int i=0; i < count; i++) {
			System.out.print("����?:");
			String name = sc.next();
			System.out.print("����?:");
			int kor = sc.nextInt();
			System.out.print("����?:");
			int eng = sc.nextInt();
			System.out.print("����?:");
			int mat = sc.nextInt();

			J_0710_dto_2 dto = new J_0710_dto_2(name, kor, eng, mat);
			dtos[i] =dto;
		}

		for(int i=0; i < dtos.length; i++) {
			System.out.print((i+1)+"��° : "+dtos[i].getName()+"\t");
			System.out.print(dtos[i].getKor()+"\t");
			System.out.print(dtos[i].getEng()+"\t");
			System.out.print(dtos[i].getMat()+"\t");
			System.out.print(dtos[i].getTotal()+"\n");
		}

		int a = 0;
		do {
			System.out.print("�̸� �˻�? 1:�˻� , 0:����");
			a=sc.nextInt();
			if(a == 1) {
				System.out.print("�˻� �̸� �Է� ?");
				String search = sc.next();

				for(int i=0; i < dtos.length; i++) {
					if(dtos[i].getName().indexOf(search) !=-1) { //-1�� �ƴϸ� �ִ�

					System.out.print((i+1)+"��° : "+dtos[i].getName()+"\t");
					System.out.print(dtos[i].getKor()+"\t");
					System.out.print(dtos[i].getEng()+"\t");
					System.out.print(dtos[i].getMat()+"\t");
					System.out.print(dtos[i].getTotal()+"\n");
				 }
		      }

			}
		}while(a != 0);  // 0�� ������ �����Ų��.



	}

}
