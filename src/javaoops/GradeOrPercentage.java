package javaoops;

import java.util.Scanner;

public class GradeOrPercentage {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the subject1 number:");
		int S1 = sc.nextInt();
		System.out.println("enter the subject2 number:");
		int S2 = sc.nextInt();
		System.out.println("enter the subject3 number:");
		int S3 = sc.nextInt();
		System.out.println("enter the subject4 number:");
		int S4 = sc.nextInt();
		System.out.println("enter the subject5 number:");
		int S5 = sc.nextInt();
		System.out.println("enter the subject6 number:");
		int S6 = sc.nextInt();
		if(S1>=35&&S2>=35&&S3>=35&&S4>=35&&S5>=35&&S6>=35) {
			
		System.out.println("student is passed");
		}
		else  {
			System.out.println("student is failed");
		}
		float total=(S1+S2+S3+S4+S5+S6);
		float percentage = total/6;
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
