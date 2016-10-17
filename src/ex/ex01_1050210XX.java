package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 1050210XX 周永振老師
 */

public class ex01_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn=new Scanner(System.in);
		System.out.println();
		
	int a=0;
	int sum=0;
	int c=0;

		while(a!=-1){
			c++;sum+=a;		System.out.println(a);
			 a=scn.nextInt();
			c=c-1;
			float d=sum/c;System.out.println(d);
			
		}
		

		
		
		
		
	}

}
