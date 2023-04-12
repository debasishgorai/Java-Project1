package Stringpgms;

public class Panagram {
	public static void main(String[] args) {
		System.out.println(panagram("The quick brown fox jumps over lazy dog"));

	}
	static boolean panagram(String s) {
		s=s.toLowerCase();
		for(char c='a';c<='z';c++) {
			if(!s.contains(c+"")) {
				return false;
			}
		}
		
		return true;
	}
	
	}

