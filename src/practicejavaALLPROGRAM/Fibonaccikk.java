package practicejavaALLPROGRAM;

import java.util.Scanner;

public class Fibonaccikk {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter upper ");
		int n= sc.nextInt();
		
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++) {
			if(c>n) {
				break;
			}
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

	}

}
