package javaoops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enteer the number");
		int num = sc.nextInt();
		 int i = 1;
		
		 int dec = 0;
		 int rem =0;
		 while(num>0) {
			 rem = num%2;
			 dec=(rem*i)+dec;
			 num= num/10;
			 i*=2;
		 	 
		 }
		System.out.println(dec);
	}
	

	

}
