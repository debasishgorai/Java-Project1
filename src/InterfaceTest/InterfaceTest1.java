package InterfaceTest;



interface Iter1 {
	int i=100;
	 void m1();
	void m2();
	
	
}
class B extends Object implements Iter1{
//abstract class B implements Iter1{
	@Override
	public void m1() {
		System.out.println("m1() implemented for class B" );
		
	}

	@Override
	public void m2() {
		System.out.println("m1() implemented for class B" );
	}
	public void m3() {
		System.out.println("m3() defined for class B ,it is pecific method");
	}
	


}
public class InterfaceTest1 {

	public static void main(String[] args) {
		
     Iter1 it = new B();
		//Iter1 it =new C ();
     it.m1();
     it.m2();
      ((B)it).m3();
     //((C)it).m4();
      
      System.out.println(Iter1.i);
	}

}
