package main;

import java.util.ArrayList;

public class J_0714 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("AAA"); 						//����������� add
		arr.add("BBB");
		arr.add("CCC");
		System.out.println("===: "+arr.get(0)); //�����ö��� get
		System.out.println("===: "+arr.get(1));
		System.out.println("===: "+arr.get(2));

		for(int i=0; i < arr.size(); i++) {  	//Arraylist�� ������ Ÿ���� size�̴�.
			System.out.println("===: "+arr.get(i));
		}

		arr.remove(1);                          //remove��  �迭���ڸ�������
		for(int i=0; i < arr.size(); i++) {
			System.out.println("==remove==: "+arr.get(i));
		}

		arr.add(1, "bbb");
		for(int i=0; i < arr.size(); i++) {
			System.out.println("==�����ֱ�=="+arr.get(i));
		}

		arr.clear();              				// clear�� �� ����� Ÿ����  void type
		System.out.println("clear"+arr.size());

		arr.add("A");
		arr.add("B");
		for(int i=0; i < arr.size(); i++) {
			System.out.println("===: "+arr.get(i));
		}

		arr.set(1, "CCC"); 						// set�� �����̴�. 1��°�ڸ��� �ִ� "B"�� "CCC"�� �ٲ��.
		for(int i=0; i < arr.size(); i++) {
			System.out.println("===set===: "+arr.get(i));
		}
	}
}
