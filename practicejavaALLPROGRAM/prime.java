package practicejavaALLPROGRAM;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		boolean flag=true;
		while(num>0) {
			for(int i=1;i<=num/2;i++) {
				if(num%i==0)
				flag =true;
				break;
			
		}
			if(!flag) {
				System.out.println("prime number");
			}
			System.out.println("not prime");
			
		}
	}
	

}
