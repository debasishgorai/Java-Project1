package DownCasting;

class A{
	public Object tvs() {
		System.out.println("Tvs xl Heavy-Duty");
		return null;
	}
}
class B extends A{
	@Override
	public A tvs() {
		System.out.println("Apacche RTR 160 Beast/Hyperedge");
		return null;
	}
}
public class Downcating {
public static void main(String[]args) {
	A a= new B();
	a.tvs();
}
}
