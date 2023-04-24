package StringPractice;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		int[]a= {12,52,11,85,45};
		sort(a);
for(int n:a) {
	
	System.out.println( n);
	
}
	}

	private static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			if(j>-1 && a[j]>k) {
				a[j]=a[j+1];
				j--;
			}
			a[j+1]=k;
		}

	}

}
