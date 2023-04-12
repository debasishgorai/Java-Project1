package javaoops;

import java.util.Scanner;

public class PrintPrimeNumbers {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

	       int i = 0;
	       int num = 0;
	       String PrimeNumbers = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int count=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		count = count + 1;
		     }
		  }
		  if (count ==2)
		  {
		    
		     PrimeNumbers = PrimeNumbers + i + "";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are "+PrimeNumbers);
	    
	   }
			
}
