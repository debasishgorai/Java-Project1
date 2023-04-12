package javaoops;

import java.util.Scanner;

public class VerifySeriesNumber {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	int a,b,c;
	a=0;
	b=1;
	c=0;
	for(;;) {
		if(c<n) {
			c=a+b;
		}
		if(c==n) {
			System.out.println("it is series number"+c);
		}
		else {
			System.out.println("it is not series number"+c);
		}
	}
}
}
