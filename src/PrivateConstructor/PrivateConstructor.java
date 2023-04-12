package PrivateConstructor ;

class A{
	int i= 10;
	static int count = 0;
	A(){
		i++;
		count++;
		System.out.println("constructor executed");//helper method
	}
	public static A getInstance() {
		A a = new A();
		return a;
	}
	public void display() {
		System.out.println(i+"i=");
	}
}
public class PrivateConstructor {

	private static final String A = null;

	public static void main(String[] args) {
		A a1 = new A();
	A.a1 = A getInstance();
	a1.display();
	
	}

}
