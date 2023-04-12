package oopsToAdvance;

class AC{
	
	
	int temperature;
	public void initTemp() {
		temperature = 18;
	}
	public void initTemp(int temperature) {
		this.temperature = temperature;
	}
	public void displayTemp() {
		System.out.println("Temperature is:"+temperature);
	}
}


public class Airconditionalclass {
	public static void main(String[]args) {
		AC ac1 = new AC();
		ac1.initTemp();
		ac1.displayTemp();
		ac1.initTemp(24);
		ac1.displayTemp();
	}

}
