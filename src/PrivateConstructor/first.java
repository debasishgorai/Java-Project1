package PrivateConstructor;

class D{
	private D() {
		System.out.println("constuctor created");
	}
	public static D getInstance() {
		return new D();
	}
}
public class first {
public static void main(String[]args) {
	D a1 = D.getInstance();
	D a2 = D.getInstance();
	System.out.println(a1==a2);
}
}
