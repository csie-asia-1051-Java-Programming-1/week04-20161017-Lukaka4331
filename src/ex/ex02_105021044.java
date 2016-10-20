package ex;
import java.util.Scanner;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021044 鐘岑哲
 */

public class ex02_105021044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char checkChar;
		System.out.println("n=");
		System.out.println("m=");

		
      
        while(true){
        	 	
        	   int n=scn.nextInt();	    
      		 int m=scn.nextInt();
      int[][]data=new int[n][m];
		for(int i=1;i<=n;i++){	
			  for(int j=1;j<=m;j++){
				System.out.println("["+i+"]["+j+"]="+i*j+"\t"	);
				
				      }
		
				
				}
			
			System.out.println("是否繼續(Y/n)=");
			checkChar=scn.next().charAt(0);
				if(checkChar=='y'||checkChar=='Y'){
						
                    continue;
				  
				}else{
					if(checkChar=='n'||checkChar=='N'){
						System.out.println("使用完畢");
						  break;
					}
				}
				    	
				    
		
				}
	 
     
        	
			
        
        
        }
	
	

		
			
	
	
	
	}	

