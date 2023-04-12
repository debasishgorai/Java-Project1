package practicejavaALLPROGRAM;

import java.util.Scanner;

public class Armstrong {
	public static int length(int num) {
		
		int count=0;
		for(;num>0;num/=10) 
			count++;
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int lenNum=length(num);
		
		if(num<0) {
			System.out.println("no negatives");
		}
;
		

			int res=0;
		
			while(num>0) {

				
			
			int rem = num % 10;
			res= res+(int)Math.pow(rem, lenNum);
			num/=10;
				
		}
		
		
		if(temp==res) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		}
	}


