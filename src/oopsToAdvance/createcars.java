package oopsToAdvance;
class car{
	String CarName;
	static int CarNo=430;
	String color;
	static {
		System.out.println("welcome");
	}{
	CarNo++;
	}
	public car(String CarName) {
		this.CarName= CarName;
		color = "black";
	}
	
	public car(String CarName,String color) {
		this.CarName= CarName;
		this.color= color;
	}
	public void displaycar() {
		System.out.println("car name:   "+CarName);
		System.out.println("car no:     "+CarNo);
		System.out.println("color is:   "+color);
		System.out.println("******       ");
	}
	
	
}



public class createcars {
	public static void main(String[]args) {
		car car1 = new car("swift");
		car1.displaycar();
		
		
		car car2 = new car("maruti","white");
		car2.displaycar();
	}
	

}
