package javaoops;

import java.util.Scanner;

public class Atm_machine {
public static void main(String []args) {
	Scanner sc= new Scanner(System.in);
	int balance = 1000000;

	
	
    while(true)  
    {  
        System.out.println("Automated Teller Machine");  
        System.out.println("Choose 1 for Withdraw");  
        System.out.println("Choose 2 for Deposit");  
        System.out.println("Choose 3 for Check Balance");  
        System.out.println("Choose 4 for EXIT");  
        System.out.print("Choose the operation you want to perform:"); 
        int choice = sc.nextInt();
        switch(choice) {
        case 1: System.out.println("enter money to be withdrawn");
        int withdraw= sc.nextInt();
        if(balance>=withdraw) {
        	balance = balance - withdraw;
        	System.out.println("please collect your money");
        }
        else {
        	System.out.println("insufficient balance");
        }
        System.out.println("");
        break;
        
        
        case 2: System.out.println("enter the money to be deposited");
        int deposit=sc.nextInt();
        balance = balance+deposit;
        System.out.println("your money has been  succesfully added/deposited to your bank");
        System.out.println("");
        break;
        
        case 3: System.out.println("Balance"+balance);
        System.out.println("");
        break;
        
        
        case 4:
			System.exit(0);
        
        }
        
    }
}
}
