package javaoops;


import java.util.Scanner;
public class gcd {


	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number");
		  int a = sc.nextInt();
			System.out.println("enter the second number");
			  int b = sc.nextInt();
				System.out.println("enter the third number");
				  int c= sc.nextInt();
	int gcd = 0;
	for(int i =1;i<=i;i++) {
		if(a%i==0 && b%i==0 && c%i==0) {
			gcd=i;
		}
		
	}
System.out.println( "gcd is="+gcd);
}


}
