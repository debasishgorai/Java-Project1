package practicejavaALLPROGRAM;

import java.util.Scanner;

public class classMarks {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter 1st subject maeks");
	int s1= sc.nextInt();
	System.out.println("enter 2nt subject maeks");
	int s2= sc.nextInt();
	
	System.out.println("enter 3st subject maeks");
	int s3= sc.nextInt();
	if(s1>=35&&s2>=35&&s3>=35) {
		System.out.println("passed");
	}
	else {
		System.out.println("failed");
	}
	float total=(s1+s2+s3);
	float percentage = total/3;
	System.out.println("percentage is:"+percentage);
	
	int g= sc.nextInt();
	if(g>=80) {
		System.out.println("grade A");
	}
	else if(g>=60) {
		System.out.println("grade B");
	}
	else if(g>=50) {
		System.out.println("grade C");
	}

	else if(g>=35
			) {
		System.out.println("grade D");
	}
	else {
		System.out.println("student is failed");
	
	
	

	}
	}
}
