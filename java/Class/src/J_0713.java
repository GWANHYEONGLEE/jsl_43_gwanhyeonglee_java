import java.util.*;
public class J_0713 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		J_0713_dto[] dtos = new J_0713_dto[3];

		dtos[0] = new J_0713_dto("ȫ�浿","����",30);
		dtos[1] = new J_0713_dto("��ȫ��","�ݻ�",20);
		dtos[2] = new J_0713_dto("�����","�뱸",35);

		for(int i=0; i < dtos.length; i++) {
			System.out.print(dtos[i].getName()+"\t");
			System.out.print(dtos[i].getArea()+"\t");
			System.out.print(dtos[i].getAge()+"\n");
		}
		System.out.println("--------------------------------");
		for(int i=0; i <dtos.length; i++) {
			if(	dtos[i].getArea().indexOf("����") != -1) {
				System.out.print(dtos[i].getName()+"\t");
				System.out.print(dtos[i].getArea()+"\t");
				System.out.print(dtos[i].getAge()+"\n");
			}
		}
	System.out.println("=========================================");
	int q =0;
	do {
		System.out.print("�˻��̸� :1, ����:2, ����:0 ?");
		q = sc.nextInt();
		if(q==1){
			System.out.print(" �̸� ? ");
			String name = sc.next();
			for(int i=0; i <dtos.length; i++) {
				if(	dtos[i].getName().indexOf(name) != -1) {
					System.out.print(dtos[i].getName()+"\t");
					System.out.print(dtos[i].getArea()+"\t");
					System.out.print(dtos[i].getAge()+"\n");
				}
			}
		}
		if(q == 2) {
			System.out.print(" ����? ");
			String area = sc.next();
			for(int i=0; i <dtos.length; i++) {
				if(	dtos[i].getArea().indexOf(area) != -1) {
					System.out.print(dtos[i].getName()+"\t");
					System.out.print(dtos[i].getArea()+"\t");
					System.out.print(dtos[i].getAge()+"\n");
				}
			}
		}
	}while(q != 0);
	System.out.println("==================��=====================");

	}
}

