
public class J_0706_1 {

	public static void main(String[] args) {
		int [][] arr = {
				{10,20,30,40},
				{50,60,70,80}
		};
		int total =0;
		for(int i=0; i < arr.length; i++) { //length의 길이는 2이다.
			for(int j=0; j < arr[i].length; j++) { //length는 4이다.
				total = total + arr[i][j];
		}
					//total =  arr[i][0]+
					// arr[i][1]+
					//arr[i][2]+
					// arr[i][3];
			System.out.println("총점 :"+total);
		}

	}

}
