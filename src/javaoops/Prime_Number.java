package javaoops;

import java.util.Scanner;

public class Prime_Number {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int num= sc.nextInt();
	int count =0;
	
		
	if(num<=1) {
		System.out.println("its not prime number");
	}

	for(int i=1;i<=num;i++) 

			if(num%i==0) {
				
			count++;
			}
		if(count==2) {
			System.out.println("its prime number");
			
			
		}
		else {
			System.out.println("its not prime number");
		}
	
}
}
