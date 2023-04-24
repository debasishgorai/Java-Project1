package ArraysAndSorts;

public class SecondSmallest {
	public static void main(String[] args) {
		int[]a= {72,72,72,89,79};
		System.out.println(Secondsmallest(a));
		

	}
	static int Secondsmallest(int[]a) {
		int s1=a[0];
		int s2= a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==s1) {
				continue;
			}
			else if(a[i]<1) {
				s2=s1;
				s1=a[i];
			}
			else if(a[i]<s2||s1==s2) {
				s2=a[i];
			}
		}
		return s2;
		
	}
}
