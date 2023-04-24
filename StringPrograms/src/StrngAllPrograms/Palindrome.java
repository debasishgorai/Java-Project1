package StrngAllPrograms;

public class Palindrome {
	public static void main(String[]args) {
		String s ="Malayalam";
		String s1=s.toLowerCase();
		String temp="";
		for(int i= s.length()-1;i>=0;i--) {
			char ch= s.charAt(i);
			temp+=ch;
			
		}
		if(s.equals(temp))
			System.out.println("palindrome");
		else System.out.println("not palindreome");
		
	}
}
