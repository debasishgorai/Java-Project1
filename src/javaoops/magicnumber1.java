package javaoops;


	import java.util.Scanner;

	public class magicnumber1 {
		public static void main(String[]args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the number");
			int num = sc.nextInt();
		  int sum = 0;
	      while (num> 0 || sum > 9)
	      {
	          if (num == 0)
	          {
	              num = sum;
	              sum = 0;
	          }
	          
	          int rem= num%10;
	          sum =sum+rem ;
	          num /= 10;
	      }

	     
	      if(sum == 1) {
	          System.out.println("It is a magic number");
	      }else {
	          System.out.println("It is not a magic number");
	      }
	}
}
