package StringPractice;

public class ReverseString {

	public static void main(String[] args) {
		String s= "java";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch= s.charAt(i);
			rev+=ch;
			
		}
		System.out.println(rev);
		
	}

}
