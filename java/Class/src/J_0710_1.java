import java.util.*;
public class J_0710_1 {

	public static void main(String[] args) { //	�ι�° ���
		Scanner sc = new Scanner(System.in);
		System.out.print("����Դϱ�?");
		int count = sc.nextInt();

		J_0710_1_dto[] dtos = new J_0710_1_dto[count];
		for(int i=0; i < count; i++) {
			System.out.print("����");
			String name = sc.next();
			System.out.print("����");
			String area = sc.next();
			System.out.print("����");
			int age = sc.nextInt();

			J_0710_1_dto dto = new J_0710_1_dto();
			dto.setName(name);
			dto.setArea(area);
			dto.setAge(age);

			dtos[i] = dto;
			}

			for(int i=0; i < dtos.length; i++) {
				System.out.print((i+1)+"��° :"+ dtos[i].getName()+"\t");
				System.out.print(dtos[i].getArea()+"\t");
				System.out.print(dtos[i].getAge()+"\n");
			}

			}
	}

