package javaoops;

import java.util.Scanner;

public class lengthofnumbers {

	public static void main(String[] args) {

		
			
			Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
			int num=sc.nextInt();
			if(num<0) {
				System.out.println("no negatives");
			}
			else {
				int sum= 0;
				int rem = num%10;
				sum = sum + rem;
				num/=10;
				System.out.println(sum);
	}

}
}