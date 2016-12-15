package ex;import java.util.Scanner;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021044 鐘岑哲
 */

public class ex04_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		   System.out.print("n=");
	    int n=scn.nextInt();
		   System.out.print("字元符號=");
	    char c=scn.next().charAt(0);
	    int sum=n;
	   for(int i=0;i<n;i++){
		   for(int j=sum;j>0;j--){
			   System.out.print(c);
		   }   System.out.println();sum--;
	   }
	}

}
