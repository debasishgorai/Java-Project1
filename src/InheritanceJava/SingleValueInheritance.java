package InheritanceJava;

class L{
	int i = 78;
	
}
class O extends L{
	int j= 32;
}

public class SingleValueInheritance {
	public static void main(String[]args) {
		O o1= new O();
		System.out.println(o1.i);
		System.out.println(o1.j);
		
	}

}
