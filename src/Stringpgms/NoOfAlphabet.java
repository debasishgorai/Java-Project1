package Stringpgms;


public class NoOfAlphabet {

	public static void main(String[] args) {
	String s="Debsis1H!@123";
	int alphabet=0;
	int number=0;
	int symbol=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='A'&& ch<='Z'||ch>='a'&& ch<='z')
			alphabet++;
		else if(ch>='0'&&ch<='9')
			number++;
		else 
			symbol++;
		
	}
	System.out.println("alphabet "+alphabet);
	System.out.println("number "+number);
	System.out.println("symbol "+symbol);

	}

}
