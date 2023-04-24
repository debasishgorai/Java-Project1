package jsp.pack2;

import jsp.pack1.Metro;

class Retro extends Metro{
	 @Override
	 protected void doSomething() {
		 super.doSomething();
	 }
 }
public class TestProtected {
	public static void main(String[]args) {
		Retro r= new Retro();
		r.doSomething();
	}

}
