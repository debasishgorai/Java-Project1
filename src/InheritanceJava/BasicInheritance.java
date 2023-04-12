
package InheritanceJava;
class R{
	int i = 67;
	public void m1() {
		System.out.println("hi, i am m1 method class");
		System.out.println("i value is"+i);
	}
}
class W extends R{
	int j= 43;
	public void m2() {
		System.out.println("hello,i am m2 method ");
		System.out.println("j value is"+j);
	}
	

}
public class BasicInheritance {
	public static void main(String[]args) {
		W w1= new W();
		System.out.println(w1.i);
		System.out.println(w1.j);
		
		w1.m1();
		w1.m2();
	}

}
