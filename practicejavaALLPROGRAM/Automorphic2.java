package practicejavaALLPROGRAM;

import java.util.Scanner;

public class Automorphic2 {
	public static int length(int num) {
		int count=0;
		for(;num>0;num/=10) {
			count++;
		}
		return count;
	}
	public static int power(int base,int exp) {
		int res=0;
		for(int i=1;i<=exp;i++) {
			res=res*base;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
	//int temp=num;
	
		int lenNum=length(num);
		while(num>0) {
			int sqrNum=power(num,2);
			int result=sqrNum%(int)Math.pow(10, lenNum);
		
	
		if(result==num) {
			System.out.println("automporphic");
		}
		else {
			System.out.println("not automprphic");
		}
	}

	}}
