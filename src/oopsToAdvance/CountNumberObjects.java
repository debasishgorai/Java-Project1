package oopsToAdvance;

class flipkart{
	static int count = 0;
	public flipkart() {
		count++;
	}
}
public class CountNumberObjects {

	public static void main(String[] args) {
		flipkart c1= new flipkart();
		flipkart c2= new flipkart();
		System.out.println("The object is:"+flipkart.count);
	

	}

}
