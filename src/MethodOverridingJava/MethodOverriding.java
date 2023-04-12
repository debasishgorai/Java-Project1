package MethodOverridingJava;
class parent{
	public void call() {
		System.out.println("7319514868");
	}
}
class child extends parent{
	public  void call() {
		System.out.println("98767777766");
	}
	
}
class MethodOverriding {
	public static void main(String[]args) {
		child c= new child();
		child child = new child();
		child.call();
		c.call();
	}

}
