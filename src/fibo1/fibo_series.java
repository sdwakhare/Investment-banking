package fibo1;

import java.util.Scanner;

public class fibo_series {
	     public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.println("enter the limit");
	    	 int n= sc.nextInt();
	    	 int a=0, b=1;
	    	 int c;
	    	 System.out.print(a + " ");
	    	 System.out.print(b + " ");
	   
	    	 for(int d=3; d<=n; d++)
	    	 {
	    		 c=a+b;
	    		 System.out.print(c + " ");     //0,1,
	    		 a=b;                       //1  1  
	    		 b=c;                        //1 2
	    	 }
			
		}

}
