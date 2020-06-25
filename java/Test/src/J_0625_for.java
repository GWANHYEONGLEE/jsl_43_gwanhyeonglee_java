import java.util.Scanner;
public class J_0625_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¸î´Ü?:");
		int dan = sc.nextInt();

		for(int K = 1; K<=9; K++) {
			System.out.println(dan+"*"+ K +"=" +(dan * K));
		}
	}

}
