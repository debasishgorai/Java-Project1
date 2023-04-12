package javaoops;

import java.util.Scanner;

public class factorial_numbers {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
		int num=sc.nextInt();
		if(num<0) {
			System.out.println("no negatives");
		}
			else {
				int i= 1;
				int fact =1;
				
				while(i<=num)
					
				fact*=i;
				i++;
				System.out.println(i+"!="+fact);
				
			}
		}
}
