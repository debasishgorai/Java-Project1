package InterfaceUpdate;

public interface Interface2 {
      
	
	default void display() {
		System.out.println("display() int interface 2");
	}
	default void def() {
		//System.out.println("display()int interfacee3");
		System.out.println("hey");
	}
}
