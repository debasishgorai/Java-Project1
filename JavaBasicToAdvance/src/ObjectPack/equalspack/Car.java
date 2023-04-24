package ObjectPack.equalspack;



public class Car {
	String carName;
	String colour;
	double price;
	int mileage;
	int fuelCapacity;
	Engine engine;
	
	public Car(String carName,String colour,double price,int mileage,int fuelCapacity,Engine engine) {
		super();
		this.carName=carName;
		this.colour=colour;
		this.price=price;
		this.mileage=mileage;
		this.fuelCapacity=fuelCapacity;
		this.engine=engine;
		
	}
	@Override
	public String toString() {
		return "Car[carName="+carName+",colour="+colour+",price="+price+",mileage="+mileage+",fuelCapacity="+fuelCapacity+",engine="+engine+"]";
	}
		@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car))
			return false;
		boolean a1= this.carName==((Car)obj).carName;
		boolean a2= this.colour==((Car)obj).colour;
		boolean a3= this.price==((Car)obj).price;
		boolean a4= this.mileage==((Car)obj).mileage;
		boolean a5= this.fuelCapacity==((Car)obj).fuelCapacity;
		boolean a6= this.engine==((Car)obj).engine;
		if(a1==true && a2==true && a3==true && a4==true && a5==true && a6==true)
			return true;
		else
			return false;
		
	
	
	
	
	}
	

	
}
