package Main;

public class J0720_test {

	public static void main(String[] args) {
		String name = "JSL���簳�߿�"; 		// ������ ���� 0,1,2,3,4,5,6,7,
		String n1 = name.substring(3); 	// 3��° ���ں��� �ڿ� ���ڱ��� ������ ������ش�.
		System.out.println("n1 : "+n1);

		String n2 = name.substring(3, 5);
		System.out.println("n2 : "+n2); // 3��° ��¥���� �����ؼ� 5��° ���� ������ ������ش�.


		String no = "S001";
		no = no.substring(1); // no = "S001"
		int noNum = Integer.parseInt(no); // noNum = 1
		noNum++;
		no = Integer.toString(noNum); // no = "1"
		int noLength = no.length(); //no.length = 1

		if(noLength == 1) no = "00"+no; // no = "001"
		else if(noLength == 2)no = "0"+no; // no = "01"

		System.out.println("no : "+no);


	}
}
