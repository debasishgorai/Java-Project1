package javaoops;

import java.util.Scanner;

public class multiplenumbers {

	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
		int num=sc.nextInt();
		
		int i = 1;
		while(i<=num)
		{
int res = num*i;
	
		System.out.println(num+"*"+i+"="+res);
		i++;
		}
}
}