package EqualsPack;


class A{
	int i;
	public A(int i) {
		this.i=i;
		
	}
	@Override
	public String toString() {
		return "A[i="+i+"]";
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof A))return false;
		return this.i==((A)obj).i;
		
	}
	//@override
	
	//if(!(obj instanceof A))return false;
	//A a=(A)obj;
}
class X{
	
}

public class Test {
	public static void main(String[]args) {
		A a1= new A(10);
		//System.out.println(a1.i);
		System.out.println(a1);
		A a2= new A(10);
		A a3= new A(10);
		
		System.out.println(a2);
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a1));
		System.out.println(a1==a3);
		System.out.println(a1.equals(a3));
		X x1= new X();
		System.out.println(a1.equals(x1));
		
	}



}
