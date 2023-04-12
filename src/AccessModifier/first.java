package AccessModifier;
class A{
 private int i= 67;
	public void accessI() {
		System.out.println(i);
	}
}
class B extends A{
	public void displayI() {
		System.out.println("i");
		accessI();
	}
}
class C{
	public void showdataI() {
		A a= new A();
		a.accessI();
	}
}
public class first {
	public static void main(String[]args) {
		A a = new A();
		a.accessI();
		B b= new B();
		//System.out.println("b.i");
		b.displayI();
		b.accessI();
	
		
		C c= new C();
		c.showdataI();
		
	
	}

}
