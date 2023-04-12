package cardevelopment;

public class TestDevelopment {
public static void main(String[]args) {
	
	Driver driver1=new Driver();
	driver1.drive(new swift());
	
	driver1.accessBluetooth(new swift());
	System.out.println("*********");
	
	
	
	
	
	driver1.drive(new Audi());
	driver1.accessBluetooth(new Audi());
	driver1.acessAc(new Audi());
	
	
	System.out.println("*********");
	
	
	driver1.drive(new Benz());
	driver1.acessAc(new Benz());
}



	
}
