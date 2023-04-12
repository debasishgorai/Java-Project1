package InheritanceJava;
class D{
	int i= 90;
	public void m1() {
		System.out.println(i);
	}
}
class P extends D{
	int j = 200;
	public void m2() {
		System.out.println(j);
	}
}

public class MultiLevelInheritance  extends P{
	int k= 780;
	public static void main(String[]args) {
		 MultiLevelInheritance a1 = new  MultiLevelInheritance();
		 System.out.println(a1.i);
		 System.out.println(a1.j);
		 System.out.println(a1.k);
		 a1.m1();
		 a1.m2();
		
	}

}
