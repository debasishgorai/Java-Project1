package oopsToAdvance;

class A1{
	public static void m1() {
		System.out.println("welcome");
	}
	public static void m1(String name) {
		System.out.println("welcome"+name);
	}
	public static void m1(int num) {
		System.out.println("The number is:"+num);
	}
	
}


public class StaticMethodOverloading {

	public static void main(String[] args) {
		A1.m1(29);
		A1.m1();
		A1.m1("Deba");
		// TODO Auto-generated method stub

	}

}
