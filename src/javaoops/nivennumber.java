package javaoops;

import java.util.Scanner;

public class nivennumber {

	public static void main(String[] args) {

		
			
			Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
			int num=sc.nextInt();
			
			if(num<0) {
				System.out.println("no negatives");
			}
			else {
				int sum= 0; 
				int temp=num;
				while(num>0)
				{
			
				int rem = num%10;
				sum = sum + rem;
				num/=10;
				}
			if(temp%sum==0)
				System.out.println("it is niven number");
			else System.out.println("it is not niven number");
	
			}	
}
}