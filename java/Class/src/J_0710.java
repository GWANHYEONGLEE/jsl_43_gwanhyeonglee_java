import java.util.*;
public class J_0710 {

	public static void main(String[] args) { //	ù��° ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���?:");
		int count = sc.nextInt();

		J_0710_dto[] dtos =  new J_0710_dto[count];
		//String name, area;
		//int age;
		//J_0710_dto dto;
		for(int i=0; i < count; i++) {
			System.out.print("����:"); // ex) ȫ�浿
			String name = sc.next();
			System.out.print("����:"); // ex) ����
			String area = sc.next();
			System.out.print("����:"); // ex) 20
			int age = sc.nextInt();
			J_0710_dto dto  = new J_0710_dto(name,area,age);
			dtos[i] =dto;
		}
		for(int i=0; i < dtos.length; i++) {
			System.out.print((i+1)+"��° :"+ dtos[i].getName()+"\t");
			System.out.print(dtos[i].getArea()+"\t");
			System.out.print(dtos[i].getAge()+"\n");
		}


	}

	}
