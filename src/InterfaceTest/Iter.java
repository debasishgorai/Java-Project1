package InterfaceTest;

import java.util.Scanner;

public class Iter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the over ");

		int over = sc.nextInt();
		int balls=1;
		int overs=1;
		
		while(over<=20) {
			if(  balls<=6) {
			System.out.println(over+" over"+ balls+"balls");
			over++;
			balls++;
			}
		}
	}

}
