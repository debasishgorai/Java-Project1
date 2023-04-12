package typecasting;


class A1{
	
}
class B1 extends A1{
	
}


public class Test1Casting {
	
public static void main(String[]args) {
	
	object obj = new object();
	System.out.println(obj instanceof object);
	//System.out.println(obj instanceof A1);
	//System.out.println(obj instanceof B1);
	
	B1 b= new B1();
	//System.out.print(b instanceof object);
	//System.out.println((b instanceof B1);
	//System.out.println((b instanceof A1 );
	
	A1 a= new A1();
	//System.out.println( a instanceof object);
	System.out.println(a instanceof A1);
	System.out.println( a instanceof B1);
	
	A1 a1= new B1();
	//System.out.println(a1 instanceof object) ;
	System.out.println(a1 instanceof A1);
	System.out.println(a1 instanceof B1);

}
}
