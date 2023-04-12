package javaoops;

import java.util.Scanner;

public class utility {

	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to my Software...! ");
		System.out.println("7ECE3 Smart Calc");
		
		for(;;)
		{
			
			System.out.println("1. Factorial \n"
					+ "2. Length \n"
					+ "3. Power \n"
					+ "4. Check ArmStrong \n"
					+ "5. Check Strong \n"
					+ "6. Range of ArmStrong\n"
					+ "7. Range of Strong");
			
			
			
			System.out.println("Enter your Choice: ");
			int choice = keyboard.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Factorial of a number: ");
				
				System.out.println("Enter the Number: ");
				int num = keyboard.nextInt();
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int result = utility.factorial(num);
					System.out.println(num + " != " + result);
				}
			}
			else if(choice == 2)
			{
				System.out.println("Length of a Number");
				
				System.out.println("Enter the Number: ");
				int num = keyboard.nextInt();
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int result = utility.length(num);
					System.out.println("Length is " + result);
				}
			}
			else if(choice == 3)
			{
				System.out.println("Power of a Number");
				System.out.println("Enter the base: ");
				int base = keyboard.nextInt();
				
				System.out.println("Enter the exponent: ");
				int exp = keyboard.nextInt();
				
				if(base < 0 || exp < 0) System.out.println("No Negatives");
				else
				{
					int result = utility.power(base, exp);
					System.out.println("The power is : " + result);
				}
				
			}
			else if(choice == 4)
			{
				System.out.println("Check for ArmStrong");
								
				System.out.println("Enter the Number: ");
				int num = keyboard.nextInt();
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int result = utility.armStrong(num);
					if(num == result) System.out.println("ArmStrong");
					else System.out.println("Not ArmStrong");
				}
				
				
			}
			else if(choice == 5)
			{
				System.out.println("Check for Strong");
				
				System.out.println("Enter the Number: ");
				int num = keyboard.nextInt();
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int result = utility.strong(num);
					if(num == result) System.out.println("Strong");
					else System.out.println("Not Strong");
				}
			}
			else if(choice == 6)
			{
				System.out.println("Range of ArmStrong Number");
				
				System.out.println("Enter the range: ");
				int range = keyboard.nextInt();
				
				if(range <= 1) System.out.println("Invalid range");
				else
				{
					for(int i=1;i<=range;i++)
					{
						if(i == utility.armStrong(i))
							System.out.println(i);
					}
				}
			}
			else if(choice == 7)
			{
				System.out.println("Range of Strong Number");
				
				System.out.println("Enter the range: ");
				int range = keyboard.nextInt();
				
				if(range <= 1) System.out.println("Invalid range");
				else 
				{
					for(int i=1;i<=range;i++)
					{
						if(i == utility.strong(i))
							System.out.println(i);
					}
				
				}
			}
			else
			{
				System.out.println("Sir/Madam your choice is wrong");
				System.out.println("Thats Okay...! , Try again");
				System.out.println("Thank you :) ");
			}
			
			System.out.println("Do you want to continue? Y/y");
			char ch = keyboard.next().charAt(0);
			
			if(ch == 'y' || ch == 'Y') 
				continue;
			else
			{
				System.out.println("Sir/Madam, Its so nice having you..!");
				System.out.println("Thank you for  using the software");
				System.out.println("Visit Again");
				break;
			}
			
		}
		

	

}
	public static int factorial(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++) fact*=i;
		return fact;
	}
	
	public static int length(int num)
	{
		int count;
		for(count = 0;num>0;num/=10) count++;
		return count;
	}
	
	public static int power(int base,int exp)
	{
		int res = 1;
		for(int i=1;i<=exp;i++) res *= base;
		return res;
	}
	
	public static int armStrong(int num)
	{
		int len = length(num);		
		int res = 0;
		for(;num>0;num/=10) res  += power(num % 10,len);
		return res;
	}
	
	public static int strong(int num)
	{
		int res = 0;
		for(;num>0;num/=10) res = res + factorial(num % 10);
		return res;
		
	}
}


