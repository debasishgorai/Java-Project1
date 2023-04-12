package javaoops;
import java.util.Scanner;
public class FibonacciSeries2 {
	
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the upper number:");
			int m= sc.nextInt();
			int a,b,c;
			a=0;
			b=1;
			c=0;
			   System.out.println(a+"+"+b);
			   
			   for(;;)
			   {
				   c=a+b;
				   if(c>m) {
					   break;
				   }
				   System.out.println(""+c);
			a=b;
			b=c;
	}
	
		}

}
