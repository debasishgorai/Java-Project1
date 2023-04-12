package practicejavaALLPROGRAM;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number");
		int a= sc.nextInt();
		if(a>=2000) {
			System.out.println("2000*"+a/2000);
			a=a%2000;
		}
		if(a>=500) {
			System.out.println("500*"+a/500);
			a=a%500;
		}
		if(a>=200) {
			System.out.println("200*"+a/200);
			a=a%200;
		}

	}

}
