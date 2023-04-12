package practicejavaALLPROGRAM;

import java.util.Scanner;

public class niven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		
		int sum=0;
		int temp=num;
		while(num>0) {
			int rem=num%10;
			num/=10;
			sum=sum+rem;
			
		}
		if(temp%sum==0) {
			System.out.println("niven number");
		}
		else {
			System.out.println("not eben");
		}

	}

}
