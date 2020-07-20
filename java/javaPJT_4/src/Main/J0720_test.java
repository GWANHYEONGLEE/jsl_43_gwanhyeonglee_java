package Main;

public class J0720_test {

	public static void main(String[] args) {
		String name = "JSL인재개발원"; 		// 문자의 순서 0,1,2,3,4,5,6,7,
		String n1 = name.substring(3); 	// 3번째 글자부터 뒤에 글자까지 끝까지 출력해준다.
		System.out.println("n1 : "+n1);

		String n2 = name.substring(3, 5);
		System.out.println("n2 : "+n2); // 3번째 글짜부터 시작해서 5번째 글자 전까지 출력해준다.


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
