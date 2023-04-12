package javaoops;

import java.util.Scanner;

public class FibonacciSeries {
   public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
	   System.out.println("enter the number:");
	   int num= sc.nextInt();
	   int a,b,c;
	   a= 0;
	   b=1;
	   c=0;
	   System.out.println(a+"+"+b);
	   for(int i=3;i<=num;i++)
	   {
		   c=a+b;
		   System.out.println(""+c);
	a=b;
	b=c;
	   }
	   }



}
