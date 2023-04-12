package oopsToAdvance;

import java.util.Scanner;

class Factorial{
	public int factor(int num) {
		int fact =1;
		for(int i=1;i<=num;i++)
	fact = fact*i;
		return fact;
		
}
}

class strong{
	public int stronglogic(int num) {
		Factorial factorial = new Factorial();
		int res=0;
		while(num>0) {
			int rem = num%10;
			res = res+factorial.factor(rem);
			num = num/10;
		}
		return res;
	}
}




public class StrongNumberAssociation {

	public static void main(String[] args) {

strong s= new strong();
Scanner sc = new Scanner(System.in);
System.out.println("num:");
int num = sc.nextInt();
if(num<0) System.out.println("no negative");
else {
	int result=s.stronglogic(num);
	if(result==num)System.out.println("i am strong number");
	else 
		System.out.println("i am not strong number");
	
			
}
	}

}
