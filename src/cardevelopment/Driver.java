package cardevelopment;

public class Driver {
public void drive(Car car) {
	car.start();
	car.accelerate();
	car.stop();
}
public void accessBluetooth(Car car) {
	if(car instanceof swift)
		((swift)car).bluetooth();
	
	if(car instanceof Audi)
		((Audi)car).bluetooth();
}
public void acessAc(Car car) {
	
	if(car instanceof Audi) {
		((Audi)car).Ac();
}
	if(car instanceof Benz )
		((Benz)car).AC();
	
}
}
