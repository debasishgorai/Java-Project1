package javaoops;

import java.util.Scanner;

public class automorphicnumber {

	
	public static int length(int num) {
		int count = 0;
		while(num>0);
		{
			count++;
			num= num/10;
			}
		return count;
	}
	
	public static int power(int base,int exp) {
		int res=1;
		for(int i=1;i<=exp;i++) {
			res = res * base;
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		if(num<0)System.out.println("no negatives");
		else {
		

			int sqrNum = power(num,2);
		System.out.println("sqrNum");
			int lenNum=length(num);
			int result = sqrNum%(int)Math.pow(10, lenNum);
			if(num==result)
				System.out.println("it is auto morphic");
			else 
				System.out.println("it is not auto morphic");
			
			
		}
			
			
		
			
			
		
				
	}

	}
	
