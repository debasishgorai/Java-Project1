package oopsToAdvance;

class Addition{
	public void add(int num) {
		System.out.println(num +num);
	}
	public void add(int x,int y) {
		System.out.println(x +y);
	}
	public void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
}


public class Testoverloading {
 public static void main(String[]args) {
	 Addition a1 = new Addition();
	 a1.add(4);
	 a1.add(6,8);
	 a1.add(12, 18, 11);
 }
}







