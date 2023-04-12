package oopsToAdvance;



	public class M {
		static int i;
		public static void displayI()
		{
			System.out.println("i="+i);
			    }
		 
		public class Test{
			public static void main(String[]args) {
				System.out.println(M.i);
				M.displayI();
			
		}
		}
}
