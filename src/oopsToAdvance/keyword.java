package oopsToAdvance;
class B{
int i;
public void init(int i) {
	this.i = i;
}
public void display() {
	System.out.println("i="+i);
	System.out.println("i="+this.i);
}
}
public class keyword {
	public static void main(String[]args) {
		 B a1 = new B();
	a1.init(10);
	a1.display();
	
	 B a2 = new B();
	a2.init(68);
	a2.display();
}
}
