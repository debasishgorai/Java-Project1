package DataEncapsulaation;

import java.util.Scanner;

class factorial{
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public int factor(){
		int fact = 1;
		for(int i=1;i<=num;i++) 
			fact = fact*i;
		return fact;
		
	}
}
public class FactorialLogic {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("num !:");
		int num= sc.nextInt();
		factorial f = new factorial();
		f.setNum(num);
		if(num<0) {
			System.out.println("no negatives");
		}
		else {
			System.out.println(f.getNum()+"!="+f.factor());
		}
	}

}
