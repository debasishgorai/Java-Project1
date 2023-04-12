package javaoops;

		import java.util.Scanner;

		public class Armstrongnumber
		{
			public static int length(int num)
			{
				int count = 0;
				for(;num > 0;num/=10) 
						
					
					 
					count++;
				return count;
			}

			public static void main(String[] args) 
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the input : ");
				int num = scan.nextInt();
				
				int lenNum = length(num);
				int temp = num;
				
				if(num < 0) System.out.println("NO Negatives");
				else
				{
					int res = 0;
					while(num > 0)
					{
						int rem = num % 10;
						res = res + (int) Math.pow(rem, lenNum);
						num/=10;
					}
					
					if(temp == res) System.out.println("ArmStrong Number");
					else System.out.println("Not ArmStrong Number");
				}

			}

		}

