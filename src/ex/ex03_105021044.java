package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021044 鐘岑哲
 */


public class ex03_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("n=");
	    int n=scn.nextInt();
		int sum=1;
		//說明有幾層
		for(int i=0;i<n;i++){
			for(int j=0;j<sum;j++){
				System.out.print("*");//sum為一個疊加值
			}		System.out.println();//為每層換行之功用
			        sum++;//在此疊加循環
			              //直到n結束為止 
		}
		
		
	}

}
