package javaoops;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
long num= sc.nextLong();
boolean prime= true;
if(num<=1) {
	System.out.println("it is not prime number");
	return;
}
for(int i=2;i*i<=num;i++) {
	if(num%i==0) {
		prime=false;
		break;
	}
}
if(prime) {
	System.out.println("it is prime number");
}
else {
	System.out.println("it is not prime number");
}
}
}