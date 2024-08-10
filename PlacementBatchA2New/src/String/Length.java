package String;

import java.util.Scanner;

public class Length {
public static void main(String[] args) {
	String s="uuuuhhh yyy kkk";
	Scanner sc=new Scanner(s);
	sc.useDelimiter("");
	int c=0;
	while(sc.hasNext()) {
		sc.next();
		c++;
	}
	System.out.println(c);
}
}
