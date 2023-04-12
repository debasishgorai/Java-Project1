package javaoops;
import java.util.Scanner;
public class PalindromeNumber {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num= sc.nextInt();
	int sum = 0;
	int temp = num;
	while(num>0) {
		int rem = num%10;
		num= num/10;
		sum= (sum*10)+rem;
		
	}
	if(temp==sum) {
		System.out.println("it is palindrone number");
	}
	else {
		System.out.println("it is not palindrone number");
	}
			
}
}
