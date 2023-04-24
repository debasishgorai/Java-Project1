package practicejavaALLPROGRAM;

import java.util.Scanner;

public class automorphic {
public static void main(String[]args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	int count = 0;
	int temp= num;
	while(num>0) {
		count++;
		num/=10;
	}
	int square = (temp*temp);
	int div = (int)Math.pow(10, count);
	int rem= square % div;
	if(temp==rem) {
		System.out.println("automprphic number");
	}
	else {
		System.out.println("not auto morphic number");
	}
	}
}
