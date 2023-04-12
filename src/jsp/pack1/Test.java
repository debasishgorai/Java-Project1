package jsp.pack1;


class A{
	public void m1() {
		System.out.println("oops completed successfully");
	}
}
class B extends A{
	
}
public class Test {

	public static void main(String[] args) {
		B b= new B();
		b.m1();

	}

}
