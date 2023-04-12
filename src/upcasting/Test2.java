package upcasting;

class A1{
	public A1() {
		//super();
		System.out.println("helloo");
	}
	public A1(String var) {
		//super();
		System.out.println(var);
		}
}
class B1 extends A1{
	public B1() {
		super("Good morning");
		System.out.println("hii");
	}
	public B1(String saluation,String UserName) {
		super("good morning");
		System.out.println(saluation+" "+UserName);
	}
}

public class Test2 {
	public static void main(String[]args) {
		new B1();
		new B1("welcome","Revi");
	}

	
}
