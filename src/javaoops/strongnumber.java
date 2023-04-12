package javaoops;

import java.util.Scanner;

public class strongnumber{
	public static int factorial(int num) {
		int fact = 1;
		for(int i =1;i<=num;i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
			int num=sc.nextInt();
			
			if(num<0) {
				System.out.println("no negatives");
			}
			else {
				int res= 0; 
				int temp=num;
				while(num>0)
				{
			
				int rem = num%10;
				res = res+ factorial(rem);
				num/=10;
				}
			if(temp%res==0)System.out.println("i am strong number");
			else System.out.println("i am not strong number");
			}
	}
}
