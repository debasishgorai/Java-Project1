package oopsToAdvance;

import java.util.Scanner;

class Jio{
	String simName;
	public Jio(String simName) {
		this.simName=simName;
	}
	public void callusingjio() {
		System.out.println("call through"+simName+"and also use internet");
	}
}
class AIRTEL{
	String simName;
	public AIRTEL(String simName) {
		this.simName=simName;
	}
public void callusingAIRTEL() {
	System.out.println("call through"+simName+"and  but cannot  use internet");
}
}

class Battery{
	String batteryName;
	public Battery(String BatteryName) {
		this.batteryName=BatteryName;
	}
}
	class phone{
		String phoneName;
		Jio jio;
		AIRTEL airtel;
		Battery battery;
		public phone(String phoneName,Battery battery) {
			this.phoneName=phoneName;
			this.battery=battery;
		
		
		}
		public void call() {
			Scanner sc = new Scanner (System.in);
			System.out.println("1.jio in2.Airtel");
			int simselect = sc.nextInt();
			switch(simselect) {
			case 1: jio= new Jio("JIO");
			jio.callusingjio();
			break;
			case 2: airtel = new AIRTEL("AIRTEL");
			airtel.callusingAIRTEL();
			break;
		
			
			}
		
			}
		
	}


public class PhoneDevelopment {
	public static void main(String[]args) {

phone phone1 = new phone("nokia", new Battery("Little-huts"));
phone1.call();

	}
	
}
