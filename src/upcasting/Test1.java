package upcasting;



class A extends Object{
	
	int i;
	int j;
	public A(int i, int j) {
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		return " A[i="+this.i+",j="+this.j+"]";
	}
}
class B extends A{
	int i;
	int j;
	public B (int i,int j) {
		super(i,j);
		this.i=i;
		this.j=j;
		
	}
	@Override
	public String toString() {
		System.out.println(super.toString());
		return " B[i="+i+",j=+"+j+"]";
	}
}
public class Test1 {

	public static void main(String[]args) {
		B b = new B(12,34);
		System.out.println(b.toString());
		System.out.println(b.i);
		System.out.println(b.j);

	}

}
