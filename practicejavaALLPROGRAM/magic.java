package practicejavaALLPROGRAM;

import java.util.Scanner;

public class magic {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0||sum<9) {
			
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		if(sum==1) {
			System.out.println("magic");
		}
		else {
			System.out.println("not magic");
		}
		
	}

}
