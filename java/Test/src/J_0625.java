public class J_0625 {

	public static void main(String[] args) {

/*
		int a = 5;
		while(a < 9) {
			System.out.println(" a:"+a);
			a++;
		}

/----------------------------------------------------------------
		int b = 1;

		while(b<=5) {
			System.out.println(b +"개 먹었습니다");
			b++;

		}
		System.out.println("다먹었습니다.");
/------------------------------------------------------------------
		int a = 1;
		while(a <= 10) {
			System.out.println("a :"+a);
			if(a > 5) {
				break;
			}
			a++;
		}
*/
		int a = 1;
		while(1<=10) {
			a++;
			if(a % 2 == 1) {
				continue;
			}
			System.out.println("a :"+a);
		}

	}
}
