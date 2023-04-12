package oopsToAdvance;
class Rectangle{
	int length;
	int breadth;
	public void intializeArea(int length,int breadth) {
	
		this.length = length;
		this.breadth= breadth;
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
public class RectangleTest {
public static void main(String[]args) {
	Rectangle r1 = new Rectangle();
	r1.intializeArea(8, 15);
	r1.displayArea();
	r1.calculateArea();
	Rectangle r2 = new Rectangle();
	r2.intializeArea(10, 20);
	r2.displayArea();
	r2.calculateArea();
}
}
