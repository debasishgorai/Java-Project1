package javaoops;

import java.util.Scanner;
 
public class lcm {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number");
  int a = sc.nextInt();
	System.out.println("enter the second number");
	  int b = sc.nextInt();
		System.out.println("enter the third number");
		  int c= sc.nextInt();
int num =1;
while(num>0) {
	if(num%a==0 && num%b==0 && num %c==0) {
		System.out.println("lcm of numbers="+num);
		break;
	}
	num++;
}
}
}