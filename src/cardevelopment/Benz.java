package cardevelopment;
public class Benz extends Car{
	@Override
	public void start() {
		System.out.println("Touch start");
	}
	public void accelerate() {
		System.out.println("Automated drive");
	}
	public void stop() {
		System.out.println("Touch stop");
	}
	public void AC() {
		System.out.println("Lyold Ac installed from Benz car");
	}
	
}
