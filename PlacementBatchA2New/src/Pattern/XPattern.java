package Pattern;

public class XPattern {
public static void main(String[] args) {
	int n=5;
	for(int i=0;i<=n;i++) {
		for(int j=0;j<=n;j++) {
			if(i==j||i+1==j+1) {
				System.out.print("*");
			}
			System.out.println();
		}}
}
}