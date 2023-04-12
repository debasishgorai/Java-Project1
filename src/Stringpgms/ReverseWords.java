package Stringpgms;

public class ReverseWords {
public static void main(String[]args) {
	String s= "happy new year";
	String[]str= s.split("");
	String temp="";
	for(int i=str.length-1;i>=0;i--) {
		temp+=str[i]+"";
	}
	System.out.println(temp.trim());
}
}
