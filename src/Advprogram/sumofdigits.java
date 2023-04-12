package Advprogram;

public class sumofdigits {
	public static void main(String[]args) {
		System.out.println(add(340));
	}
	static int add(int n) {
		if(n<=9) return n;
		return add(n/10)+n%10;
	}

}
