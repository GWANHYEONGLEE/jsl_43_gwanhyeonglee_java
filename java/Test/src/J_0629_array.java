
public class J_0629_array {

	public static void main(String[] args) {

		String[] a = new String[5];
		a[0] = "A";
		a[1] = "b";
		a[2] = "100";
 		a[3] = "��";
		a[4] = "ab";

		for(int k=0; k < a.length; k++){
			System.out.println("a :"+a[k]);

		}


		int[] b = {10,15,20};
		System.out.println("b�� �迭�Ǳ���:"+b.length);

		for(int k=0; k < b.length; k++) {
			System.out.println("b[0] :"+b[k]);
		}





	}
}
