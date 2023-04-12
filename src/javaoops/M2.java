package javaoops;

public class M2 {
	
		static int i;
		public static void displayI()
		{
			System.out.println("i="+i);
			    }
		 
		public class Test{
			public static void main(String[]args) {
				System.out.println(M2.i);
				M2.displayI();
			
		}
		}
}
