package practicejavaALLPROGRAM;

import java.util.Scanner;

public class eligibleforvote {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		
		System.out.println("enter age");
		int a= sc.nextInt();
		if(a>=18) {
			System.out.println("ypu are eligible");
		}
		else {
			System.out.println("not eligiblr");
		}

	}

}
