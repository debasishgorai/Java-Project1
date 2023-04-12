package Advprogram;

public class AddNumbers {

	public static void main(String[] args) {
		System.out.println(add(20));

	}
	static int add(int n) {
		if(n==1) return 1;
		return n+ add(n-1);
	}

}
