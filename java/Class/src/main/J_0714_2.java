package main;
import java.util.ArrayList;
import dto.J_0714_2_dto;
public class J_0714_2 {
	public static void main(String[] args) {
		ArrayList<J_0714_2_dto> arr = new ArrayList<>();
		J_0714_2_dto dto1 = new J_0714_2_dto("홍길동","대전",30);
		J_0714_2_dto dto2 = new J_0714_2_dto("박길수","서울",50);
		arr.add(dto1);
		arr.add(dto2);
		arr.add(new J_0714_2_dto("안상수","부산",40)); 				//현재 size는 3이다

		for(int i=0; i < arr.size(); i++) {
			System.out.print(arr.get(i).getName()+"\t");
			System.out.print(arr.get(i).getArea()+"\t");
			System.out.print(arr.get(i).getAge()+"\n");
		  }
	   }
	}
