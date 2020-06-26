
public class J_0626_array {

   public static void main(String[] args) {
/*
   //첫번째 방법

	  int[] a = new int[3];
	  a[0] = 10;
	  a[1] = 20;
	  a[2] = 30;

	  System.out.println(" a[0] :"+a[0]);
	  System.out.println(" a[1] :"+a[1]);
	  System.out.println(" a[2] :"+a[2]);

//---------------------------------------------------

	 //두번째 방법

	  int[] b = {10,20,30,40};
	  System.out.println(" b[0] :"+b[0]);
	  System.out.println(" b[1] :"+b[1]);
	  System.out.println(" b[2] :"+b[2]);
	  System.out.println(" b[3] :"+b[3]);


//------------------------------------------------------

	  //2번째 방법을 for문으로 바꾸기.

	  int[] c  = {10,20,30};
	  System.out.println("c의 배열의길이:"+c.length);  //배열의 길이는 칸수이다.
	                                              //length는 int 타입이고  길이를 나타낸다
	  for(int k=0; k <=c.length; k++) {
		  System.out.println(" c[0] : "+c[k]);
	  }

//------------------------------------------------------------------------

	   String[] d = new String[2];
	   d[0] ="A";
	   d[1] ="B";

	   String[] e = {"A","B"};
	   for(int k=0; k<e.length; k++) {
		   System.out.println(" e:"+e[k]);
	   }

*/

	   int[] aa = {10,20,30};
	   int total =0;
	   for(int k=0; k<aa.length; k++) {
		   total = total + aa[k];
	   }
	   System.out.println("총계 :"+total);



	}
}
