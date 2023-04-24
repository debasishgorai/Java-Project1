package ObjectpackToString;
class A{
	int i;
	public A(int i) {
		this.i=i;
		
	}
	@Override
	public String toString() {
		return "A[i="+i+"]";
	}
}


public class Test {
	public static void main(String[]args) {
		A a1= new A(10);
		//System.out.println(a1.i);
		System.out.println(a1);
		A a2= new A(10);
		System.out.println(a2);
		//System.out.println(a1==a2);
	}

}
