package typecasting;
class object{
	
}
class A extends object
{
	int i= 100;
	public void m1() {
		System.out.println("good day");
	}
	public void m2() {
		System.out.println("hi");
	}
}
class j extends A{
	int i= 200;
	@Override
	
	public void m2() {
		System.out.println("hello");
	}
	public void m3() {
		System.out.println("welcome");
	}
}
public class TestCasting {

	public static void main(String[] args) {
		
A a1= new j();
A a= (A) new j();
System.out.println(a.i);
a.m1();
a.m2();
	}

}
