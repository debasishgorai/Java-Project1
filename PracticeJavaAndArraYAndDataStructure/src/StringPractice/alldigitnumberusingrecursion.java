package StringPractice;

public class alldigitnumberusingrecursion {
public static void main(String []args) {
	System.out.println(sum(1234));
}

private static int sum(int n) {
	if(n==0) {
		return 0;
	}
	int a= n%10+sum(n/10);
	if(a>9) {
		sum(a);
	}
	return a ;
}
}
