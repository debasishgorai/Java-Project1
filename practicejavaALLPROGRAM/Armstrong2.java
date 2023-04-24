package practicejavaALLPROGRAM;

import java.util.Scanner;

public class Armstrong2 {
	public static int length(int num) {
		int count=0;
		for(;num>0;num/=10) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int res=0;
		int temp=num;
		int lenNum=length(num);
		while(num>0) {
			int rem=num%10;
			num/=10;
			res=res+(int)Math.pow(rem, lenNum);
			
		}
		if(temp==res) {
			System.out.println("armstronh");
		}
		else {
			System.out.println("not armstrong");
		}
		

	}

}
