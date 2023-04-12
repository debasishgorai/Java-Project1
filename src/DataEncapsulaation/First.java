package DataEncapsulaation;
class A{
	private int i;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i=i;
		
	}
}
 public class First {
	 public static void main(String[]args) {
		 A a = new A();
		 System.out.println(a.getI());
	 }

}
