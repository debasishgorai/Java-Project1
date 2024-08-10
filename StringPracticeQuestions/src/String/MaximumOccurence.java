package String;

public class MaximumOccurence {
public static void main(String[] args) {
	String s="rammmmm";
	String s1="";
	int max;
	while(s.length()>0) {
		char c=s.charAt(0);
		s1=s1.replace(c+"", " ");
		int count=s.length()-s1.length();
		
if(count>=2)
		System.out.println(count +" "+c);
	}
	//System.out.println(count +" "+c);
}
}
