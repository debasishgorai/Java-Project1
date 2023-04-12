package javaoops;
import java.util.Scanner;
public class factorial {

		public static int factorial() 
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the input");
			int num = sc.nextInt();
		
			int fact=1;
			for(int i=1;i<=num;i++) 
				fact= fact*i;
			
		
		System.out.println(num+"i=");
		
		return fact;

	
	}

}