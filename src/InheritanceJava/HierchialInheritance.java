package InheritanceJava;
 class Vehicle{
	 int roofwheals;
	 public void happy() {
		 System.out.println("i am your brother");
	 }
 }
 class Bike extends Vehicle{
	 public void m1() {
		 System.out.println("hi");
	 }
	 public void m3() {
		 
	 }
 }
 class Car extends Vehicle{
	 public void m2(int b) {
		 System.out.println("roof wheals");
	 }
 }
public class HierchialInheritance {
	public static void main(String[]args) {
	Car c1= new Car();
	c1.m2(4);
	c1.happy();
	
	Bike b1 = new Bike();
	b1.happy();
	b1.m1();
	
}
}
