package main;
import java.util.ArrayList;
import dto.J_0714_2_dto;
public class J_0714_2 {
	public static void main(String[] args) {
		ArrayList<J_0714_2_dto> arr = new ArrayList<>();
		J_0714_2_dto dto1 = new J_0714_2_dto("ȫ�浿","����",30);
		J_0714_2_dto dto2 = new J_0714_2_dto("�ڱ��","����",50);
		arr.add(dto1);
		arr.add(dto2);
		arr.add(new J_0714_2_dto("�Ȼ��","�λ�",40)); 				//���� size�� 3�̴�

		for(int i=0; i < arr.size(); i++) {
			System.out.print(arr.get(i).getName()+"\t");
			System.out.print(arr.get(i).getArea()+"\t");
			System.out.print(arr.get(i).getAge()+"\n");
		  }
	   }
	}
