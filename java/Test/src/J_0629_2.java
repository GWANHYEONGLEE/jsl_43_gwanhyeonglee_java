import java.util.Scanner;
public class J_0629_2 {

	public static void main(String[] args) {


		String[] info = new String[3];
		String[] g = {"이름", "지역 ", "나이"};
	    Scanner sc = new Scanner(System.in);
	    String z = ":", x = " / ";


		for(int k =0; k < info.length; k++) {
			System.out.println(g[k]+"입력?:");
			info[k] = sc.next();
		}
		for(int i =0; i <info.length; i++) {

		}
		System.out.println(g[0]+":"+info[0]+" / "+g[1]+":"+info[1]+" / "+g[2]+":"+info[2]);

	}

}
