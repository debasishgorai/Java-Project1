package javaoops;
import java.util.Scanner;
public class Fibonacci {
	   public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
		   System.out.println("enter the  first number:");
		   int num1= sc.nextInt();
		   System.out.println("enter the Second number:");
		   int num2= sc.nextInt();
		   int a,b,c;
		   a=0;
		   b=1;
		   c=0;
		   if(num1==0) {
			   System.out.println(a+""+b);
			   
		   }
		   for(;;) {
			   c= a+b;
			   if(c>num2) {
				   break;
			   }
			   if(c>=num1) {
				   System.out.println(""+c);
				   a=b;
				   b=c;  
			   }
			  
		   }
	

}}
