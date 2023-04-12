package Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[]a= {90,78,8,98};
		sort(a);
for(int n:a) {
	
	System.out.println( n);
	
}
	}

	private static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			while(j>-1&&a[j]>k) {
				a[j+1]=a[j];
				j--;
				
			}
			a[j+1]=k;
		}
		
	}

}
