
public class J_0706_2 {

	public static void main(String[] args) {
		String[][] arr = {
			{"홍길동","50","60","70",""},
			{"안상수","40","80","80",""}
		};
		int total = 0;
		for(int i=0; i <arr.length;i++) {
			total =0;
			for(int j =1; j < arr[i].length-1; j++) {
				total += Integer.parseInt(arr[i][j]);//공백
			}
			//total = Integer.parseInt(arr[i][1])+
					// Integer.parseInt(arr[i][2])+
					// Integer.parseInt(arr[i][3]);
			arr[i][4] = Integer.toString(total);
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0]);
			System.out.println(arr[i][1]);
			System.out.println(arr[i][2]);
			System.out.println(arr[i][3]);
			System.out.println(arr[i][4]);
		}
	}

}
