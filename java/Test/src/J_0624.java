import java.util.Scanner;
public class J_0624 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int milk = 1200;
		int cola = 1100;
		int runch = 4000;
		int age = 0;
		double total = 0;
		System.out.print("상품: 우유:1, 콜라:2, 도시락:3, 선택?");
		int pro = sc.nextInt();
		System.out.print("지역: 서구:1, 중구:2, 대덕구:3, 선택?");
		String area = sc.next();
		System.out.print("수량? ");
		int amount = sc.nextInt();
		if(pro == 1 || pro == 3) {
			System.out.print("나이 ?");
			age = sc.nextInt();

		}
		System.out.print("지역? ");

		if(pro == 1) {
			if(age <= 13)  total = (milk * 0.8) * amount;
			else  total = milk * amount;
		}else if(pro == 2) {
			total = cola * amount;
		}else if(pro == 3) {
			if(age <= 55)  total = (milk * 0.7) * amount;
			else total = runch * amount;
		}
		if(area.equals("중구")) total = total * 0.95;
		if(area.equals("대덕구")) total = total * 0.90;

		System.out.print("총 금액 : "+ (int)total+"입니다.");

}
}
