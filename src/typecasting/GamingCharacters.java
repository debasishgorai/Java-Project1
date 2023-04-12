package typecasting;


class Animal{
	public void drinkwater(){
		System.out.println("every animal requires water" +" to survive");
	}
	public void sound() {
		
	}
	public void movement() {
		
	}
}
class Lion extends Animal{
	@Override
	public void sound() {
		System.out.println("lion roars");
	}
	
	@Override
	public void movement() {
		System.out.println("lion runs/walks");
	}
	
	public void preyFinding() {
		System.out.println("Attacks the prey and finds living");
	}
}


class snake extends Animal{
	@Override
	public void sound() {
		System.out.println("HHHHHHHsssssss");
	}
	
	@Override
	public void movement() {
		System.out.println("nagin dancceee");
	}
	
	public void venomUse() {
		System.out.println("snakes venom is use some guidline");
	}
}

public class GamingCharacters {

	public static void main(String[] args) {
		
		
		Lion lion = new Lion();
	    lion.drinkwater();
	    lion.sound();
		lion.movement();
		
		
		
		Animal animall = new Lion();
		animall.drinkwater();
		animall.sound();
		animall.movement();
		System.out.println("/////////");
		
		Lion lion1 = (Lion) animall;
		lion1.preyFinding();

		Animal animal2 = new snake();
		animal2.drinkwater();
		animal2.sound();
		animal2.movement();
		
		((snake)animal2).venomUse();		

	}

}
