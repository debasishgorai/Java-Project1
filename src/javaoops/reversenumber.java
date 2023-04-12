package javaoops;

import java.util.Scanner;

public class reversenumber {


	public static void main(String[] args) {

		
			
			Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
			int num=sc.nextInt();
			int temp= num;
			if(num<0) {
				System.out.println("no negatives");
			}
			else {
				while(num>0)
				{
				int rev= 0;
				int rem = num%10;
				rev = rev*10+rem;
				num/=10;
				System.out.println(temp+"reverse is"+rev );
	}}
}
}