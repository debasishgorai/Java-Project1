package PrimeNumber;

public class ReverEach {
public static void main(String[] args) {
	String s="ram ui bh";
	String temp="";
	char []a=s.toCharArray();
	for(int i=a.length-1;i>=0;i--) {
		if(i>=0 & a[i]==' ') {
		char c=s.charAt(i);
		temp+=c;
	}
	}
	System.out.println(temp);
}
}
