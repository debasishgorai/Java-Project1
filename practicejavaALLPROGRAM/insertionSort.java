package practicejavaALLPROGRAM;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []a= {34,89,76,90,56};
      bsort(a);
      for(int n:a) {
    	  System.out.println(n);
      }
	}

	private static void bsort(int[] a) {
		// TODO forAuto-generated method stub
		for(int i=1;i<a.length;i++) {
			int j=i-1;
			int key=a[i];
			while(j>-1&&a[j+1]<key) {
				a[j+1]=a[j];
			//a[key]=a[j+1];
				j--;
			}
			a[j+1]=key;
		}
	}

}
