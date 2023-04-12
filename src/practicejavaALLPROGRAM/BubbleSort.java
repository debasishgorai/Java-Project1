package practicejavaALLPROGRAM;

public class BubbleSort {

	public static void main(String[] args) {
		int[]a= {67,90,56,23};
		Bsort(a);
		for(int n:a) {
			System.out.println(n);
		}
	}

	private static void Bsort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
			}
		}
		
		
	}

}
