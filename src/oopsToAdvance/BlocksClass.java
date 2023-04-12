package oopsToAdvance;

class p{
	static int i;
	int j;
	{
		i++;
		j++;
	}
	{
		i++;
		j++;
	}
}


public class BlocksClass {

	public static void main(String[] args) {
	
        p a1 = new p();
        System.out.println(p.i);
        System.out.println(a1.j);
        
        
        p a2 = new p();
        System.out.println(p.i);
        System.out.println(a2.j);

}}
