package practicejavaALLPROGRAM;

import java.util.Scanner;

public class happy {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int sum=0;
	while(num>0 ||sum>9) {
		if(num==0) {
			num=sum;
			sum=0;
		}
		int rem=num%10;
		int temp=num;
		int square= num;
		num/=10;

		sum=sum+(rem*rem);
	}
		
		if(sum==1) {
			System.out.println("happy number");
		}
		else {
			System.out.println("not a happy number");
		}
		
		
	
	

	}

}
