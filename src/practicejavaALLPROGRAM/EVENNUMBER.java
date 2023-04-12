package practicejavaALLPROGRAM;

import java.util.Scanner;

public class EVENNUMBER {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number");
		int a= sc.nextInt();
		if(a%2==0) {
			System.out.println(a+"even number");
		}
		else {
			System.out.println(a+"odd number");
		}
		
	}

}
