package practicejavaALLPROGRAM;

import java.util.Scanner;

import javaoops.factorial;

public class ist {
	
	
			
	public static void main(String[] args) {

		
		
		Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("no negatives");
		}
		else {
			int sum= 0;
			while(num>0||sum>9)
			{
				if(num==0) {
					sum=0;
					sum = num;;
				}
		
			int rem = num%10;
			sum = sum + rem;
			num/=10;
		
			}
			
			if(sum==1) {
				System.out.println("magic number");
			}
			else {
				System.out.println("not magic number");
			}
		}}}
			
			
			
			
			
			