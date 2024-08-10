package PrimeNumber;

import java.util.Scanner;

public class BiggestPrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first and last number");
		int f= sc.nextInt();
		int l= sc.nextInt();
		int sl=0;int la=0;
		for(int i=f;i<=l;i++) {
		if(isprime(i)) {
			sl=la;
			la=i;
		}}	
		System.out.println(la+"enter large");
		System.out.println(sl+"second large");
		

	}

	private static boolean isprime(int n) {
		int count=0;
		for(int i=1;i<=n;i++)
		if(n%i==0) {
			count++;
		}
		
		
		
		return count==2;
	}

}