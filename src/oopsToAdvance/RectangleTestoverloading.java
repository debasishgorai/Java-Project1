package oopsToAdvance;
 
class R1{
int length;
int breadth;
public void initRect(){

	length = 5;
	breadth= 8;
}
public void initRect(int num) {
length = num;
breadth= num;
}
public void initializeArea(int length,int breadth) {
this.length=length;
this.breadth=breadth;
}

public void calculateArea() {
int area = length * breadth;
System.out.println("the area is:"+area);
System.out.println("*****************************");
}
}
public class RectangleTestoverloading{

public static void main(String[]args) {
R1 r1 = new R1();
r1.initRect();
r1.calculateArea();

r1.initRect(4);
r1.calculateArea();

r1.initializeArea(7,6);
r1.calculateArea();

}
}




