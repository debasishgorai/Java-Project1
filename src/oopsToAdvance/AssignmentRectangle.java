package oopsToAdvance;

class R7{
	int length;
	int breadth;
	public R7 (int length,int breadth) {
	
		this.length = length;
		this.breadth= breadth;
}
	public R7(int num) {
		this(num,num);
	}
public void displayArea() {
	System.out.println("length="+ length +"breadth="+breadth);
	System.out.println("length="+ this.length +"breadth="+this.breadth);
}

public void calculateArea() {
	int area = length * breadth;
	System.out.println("the area is:"+area);
	System.out.println("*****************************");
}
}

public class AssignmentRectangle {

	public static void main(String[] args) {
		R7 r1 = new R7(4,7);
		r1.displayArea();
		r1.calculateArea();
		R7 r2 = new R7(12);
		r2.displayArea();
		r2.calculateArea();
		
	}

}
