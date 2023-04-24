package jsp.pack3;
class A{
	int i=100;
}
class B extends A{
	int i=250;
	public void display() {
		System.out.println("super i="+super.i);
		System.out.println("i="+this.i);
	}
}
public class CastingAccess {

	public static void main(String[] args) {
		
A a = new B();
//how to call display?
((B)a).display();


System.out.println(a.i);

//System.out.println((B)a.m4();
//want to print 250?
//call display method to print 100 and 250?
	}

}
