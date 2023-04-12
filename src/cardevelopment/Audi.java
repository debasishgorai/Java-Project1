package cardevelopment;

public class Audi extends Car {
	@Override
public void start() {
		System.out.println("Button start");
	}
	@Override
public void accelerate() {
		System.out.println("full clutch drive");
	}
	@Override
public void stop() {
		System.out.println("Button stop");
	}
	@Override
public void bluetooth() {
		System.out.println("sony bluetooth in audi car installed");
	}
	@Override
public void Ac() {
		System.out.println("Bluestar Ac installed for audi");
	}
}
