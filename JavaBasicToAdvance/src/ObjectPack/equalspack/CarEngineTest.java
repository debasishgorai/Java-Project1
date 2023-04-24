package ObjectPack.equalspack;

public class CarEngineTest {
public static void main(String[]args) {
	Engine e1= new Engine("eng01",760,2022);
	System.out.println(e1);
	Engine e2= new Engine("eng01",760,2022);
	System.out.println(e2);
	
	Car c1= new Car("audi","black",10000,10,30,e1);
	System.out.println(c1);

	Car c2= new Car("audi","black",10000,10,30,e1);
	System.out.println(c2);
	boolean res1=c1.equals(c2);
	if(res1)System.out.println("two cars are not same");
	else System.out.println("two cars are not same");
	System.out.println("***********");
	boolean res2=e1.equals(e2);

	if(res2)System.out.println("two cars are not same");
	else System.out.println("two cars are not same");
	
	
}
}
