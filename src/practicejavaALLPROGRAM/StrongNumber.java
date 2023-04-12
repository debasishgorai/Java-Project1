package practicejavaALLPROGRAM;

import java.util.Scanner;

public class StrongNumber {
	public static int factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	

	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int res=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			num/=10;
			res=res+factorial(rem);
			
		}
		if(temp%res==0) {
			System.out.println("strong number");
		}
		else {
			System.out.println("not strong");
		}
		

	}

}
