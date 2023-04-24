package StringPractice;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= " Madam";
		//s=s.toLowerCase();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch= s.charAt(i);
			rev+=ch;
			
		
		//System.out.println(rev);
		}	
	
	if(s.equals(rev)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
		
		}
}
