package String;

public class ReverseEach {
public static void main(String[] args) {
	String s="ram is great";
	String  temp="";
	for(int i=s.length()-1;i>=0;i--) {
		char c=s.charAt(i);
		if(c==' ') {
		temp+=c;
		}
	}
	System.out.println(temp);
}
}
