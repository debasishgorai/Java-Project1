package StrngAllPrograms;

public class PalindromeWithReverse {
	public static void main(String[] args) {
String s="madamo";
if(palindrome(s))
	System.out.println("palindrome");
else
	System.out.println("not a palindrome");

	}
	public static boolean palindrome(String s) {
		int i= 0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
				
			}
			i++;
			j--;
			
		}
		return true;
	}
}
