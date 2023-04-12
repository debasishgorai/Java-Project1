package Stringpgms;

public class Encryption {

	public static void main(String[] args) {
		System.out.println(encrypt("iloveyou", 8));

	}
	static String encrypt(String s,int n) {
		char[]a=new char[26];
		char ch='a';
		for(int i=0;i<a.length;i++) {
			a[i]=ch;
			ch++;
		}
		String s2="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int index=c-'a';
			index+=n;
			s2+=a[index%26];
		}
		return s2;
	}

}
