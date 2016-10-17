package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021044 鐘岑哲
 */

public class ex01_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn=new Scanner(System.in);
		System.out.println("輸入=");		
		
		int a=0;
	    int sum=1;
	    int c=0;

        while(a!=-1){	
         a=scn.nextInt();
        c++;sum+=a;	}	System.out.println("總和="+sum);		
         c=c-1	;System.out.println("平均="+(float) sum/c);
        	
        




			
		}
		

		
		
		
		
	}


