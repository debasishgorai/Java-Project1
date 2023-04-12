package oopsToAdvance;

class V{
	int i;
	static int j;
	static {
		j=100;
		System.out.println("hi");
	}{
	i=60;
	System.out.println("hello");
	
}
}
public class TestBlocks {

	public static void main(String[] args) {
	
        V a1 = new V();
        V a2 = new V();
        V a3 = new V();
        
        System.out.println(V.j);
        System.out.println(a1.i);
        System.out.println(a3.i);
        System.out.println(a2.i);
	}

}
