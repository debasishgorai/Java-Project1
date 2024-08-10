package String;

public class RemoveDuplicate {
public static void main(String[] args) {
	String s="ramdeeb";
	char[]a=s.toCharArray();
	for(int i=0;i<=a.length-1;i++) {
		int count=0;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]!=a[j]) {
				count++;
			}
		
		}
		if(count>=1) {
			System.out.println(a[i]);
		}
	}
}
}
