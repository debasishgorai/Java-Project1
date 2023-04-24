package InterfaceUpdate;

public interface Interface1 {

	//public static void main(String[] args) {
	//System.out.println("Hello World");
//void m1();
	//}

	void m1();
public static void staticMethod() {
	System.out.println("static() in interface");
	
}
     default void def() {
    	System.out.println("def() in interface"); 
     }
     default int sum(int a,int b) {
    	 return a+b;
     }
    // default boolean equals(Object a) {
    	// return false;
    	 //we cannot same method signature as object method
    // }
}
