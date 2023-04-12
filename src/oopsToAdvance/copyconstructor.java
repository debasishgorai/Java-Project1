package oopsToAdvance;




class D{
	
	int i ;
	public D(int i) {
		this.i=i;
	}
	public D(D a) {
		this.i=a.i;
	}
	public void display()
{
		System.out.println("i="+i);
		
}
}
public class copyconstructor {

	public static void main(String[] args) {
		D a1= new D(10);
		a1.display();
		
		D a2= new D(a1);
		a2.display();
		

	}

}
