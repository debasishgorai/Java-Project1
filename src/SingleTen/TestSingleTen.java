package SingleTen;

class A{
	private static A t=null;
	private A() {
	}
	public static A getInstance() {
		if(t==null) t= new A();
		return t;
	}
}
public class TestSingleTen {
public static void main(String[]args) {
	A a1 = A.getInstance();
	A a2 = A.getInstance();
	A a3 = A.getInstance();
	System.out.println(a1==a2);
	System.out.println(a2==a3);
	System.out.println(a1==a3);
}
}
