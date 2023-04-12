package InterfaceTest;

	interface Iter {
		int i=100;
		 void m1();
		void m4();
		void m2();
		
		
	}
	//class B extends Object implements Iter1{
	abstract class B implements Iter{
		@Override
		public void m1() {
			System.out.println("m1() implemented for class B" );
			
		}

		

		//@Override
		//public void m2() {
		//	System.out.println("m1() implemented for class B" );
		//}
		public void m3() {
			System.out.println("m3() defined for class B ,it is pecific method");
		}
		
	}
	class C extends B {
		@Override
		public void m2() {
			System.out.println("m2() implemented for class C" );
			
		}

		
		public void m4() {
			System.out.println("m4() implemented for class C" );
		
	}
	}
	
	public class interface2 {

		public static void main(String[] args) {
			
	    // Iter1 it = new B();
			Iter it =new C ();
	     it.m1();
	     it.m2();
	      //((B)it).m3();
	     ((C)it).m4();
	      
	      System.out.println(Iter.i);
		
	}
	
}
