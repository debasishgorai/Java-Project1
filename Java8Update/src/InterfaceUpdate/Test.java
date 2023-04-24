package InterfaceUpdate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Interface1 i= new ImpClass();
  i.m1();
	Interface1.staticMethod();
	i.def();
	ImpClass class1= new ImpClass();
	class1.def();
	
	
	System.out.println(i.sum(45, 34));
class1.display();
	//Interface.main();
	//Interface2.main();





     //JAVA8UPDATE:-
//in java 8 update we got default mehod and staatic method and both these methods are concrete methods
	//by default methods we can be access a caused by create try the object of implementetry class and cally dafault method by it reference.the static methodby it reference by interface
	}// the only rule to follow while creating a default method insidemethods,is the default methods and signature should defeaeted from method signature.we can achive method multiple inheritance
}
