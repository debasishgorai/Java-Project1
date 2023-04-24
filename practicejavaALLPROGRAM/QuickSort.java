
package practicejavaALLPROGRAM;

public class QuickSort {

	public static void main(String[] args) {
		int[]a= {23,45,89,67,45,34};
		sort(a,0,a.length);
		for(int n:a) {
			System.out.println(n);
		}
System.out.println();
	}

	public static void sort(int[] a, int start , int end) {
		int pivot=a[(start+end)/2];
		int i=start;int j=end;
	if(start>=end) {
		return;
	}
	while(i<=j) {
		while(a[i]<pivot) i++;
		while(a[j]>pivot) j--;;
		//i++;
		//j--;
		
	}
	if(i<=j) {
		int temp=a[j];
		a[j]=a[i];
		a[j]=temp;
		
	}
	sort(a,start,i);
	sort(a,i,end);
	
		
	}

}
