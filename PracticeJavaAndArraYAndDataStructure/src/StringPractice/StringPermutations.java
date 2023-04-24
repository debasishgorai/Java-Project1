package StringPractice;

public class StringPermutations {

	private static final String String = null;

	public static void main(String[] args) {
		permutation("abc",0,2);

	}

	private static void permutation(String s, int start, int end) {
		if(start==end) {
			System.out.println(s);
			return;
		
		//int i=start,j=end;
		//if(i<=j) {
			String s1= swap(String s, start,i);
			permutation(s1,start+1,end);
			
		}
	int i=start;int j=end;
	  static String swap(String s,int i,int j) {
			char c= s.toCharArray(0);
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
		}
		return new String(a);
	}

}
