package main;

import java.util.ArrayList;

public class J_0714 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("AAA"); 						//집어넣을때는 add
		arr.add("BBB");
		arr.add("CCC");
		System.out.println("===: "+arr.get(0)); //가져올때는 get
		System.out.println("===: "+arr.get(1));
		System.out.println("===: "+arr.get(2));

		for(int i=0; i < arr.size(); i++) {  	//Arraylist의 길이의 타입은 size이다.
			System.out.println("===: "+arr.get(i));
		}

		arr.remove(1);                          //remove는  배열의자리를삭제
		for(int i=0; i < arr.size(); i++) {
			System.out.println("==remove==: "+arr.get(i));
		}

		arr.add(1, "bbb");
		for(int i=0; i < arr.size(); i++) {
			System.out.println("==끼워넣기=="+arr.get(i));
		}

		arr.clear();              				// clear은 다 지우기 타입은  void type
		System.out.println("clear"+arr.size());

		arr.add("A");
		arr.add("B");
		for(int i=0; i < arr.size(); i++) {
			System.out.println("===: "+arr.get(i));
		}

		arr.set(1, "CCC"); 						// set은 수정이다. 1번째자리에 있는 "B"를 "CCC"로 바꿔라.
		for(int i=0; i < arr.size(); i++) {
			System.out.println("===set===: "+arr.get(i));
		}
	}
}
