import java.util.*;
public class J_0701_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t_list = "";
		int score = 0;
		int total = 0;

		System.out.print("몇과목? : ");
		int listnum = sc.nextInt();

		String[] title = new String[listnum+3];
		String[] main = new String[listnum+3];

		System.out.print("이름 ?: ");
		String name = sc.next();
		main[0] = name;

		for(int i=1; i <=title.length-3; i++ ) {
			System.out.print(i + "번째 과목명: ");
		t_list = sc.next();
		title[i] = t_list;
		}

		for(int i =1; i <= title.length-3; i++) {
			System.out.print(title[i] + "점수 :");
			score = sc.nextInt();
			total += score;
			main[i] = Integer.toString(score);
		}

		title[0] =	"성명";
		title[title.length-3] = "총점";
		title[title.length-2] = "평균";
		title[title.length-1] = "등급";

		main[main.length-3] = Integer.toString(total);
		main[main.length-2] = Double.toString(total/(double)listnum);

		if(Double.parseDouble(main[main.length-2]) >= 90) {
			main[main.length-1] = "수";
		}else if(Double.parseDouble(main[main.length-2]) >= 80) {
			main[main.length-1] = "우";
		}else if(Double.parseDouble(main[main.length-2]) >= 70) {
			main[main.length-1] = "미";
		}else if(Double.parseDouble(main[main.length-2]) >= 60) {
			main[main.length-1] = "양";
		}else {
			main[main.length-1] = "가";
		}


		for(int i =0; i <title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println("");

		for(int i =0; i < title.length; i++) {
			System.out.print(main[i]+"\t");
		}
}
}
