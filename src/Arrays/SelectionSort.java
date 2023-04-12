package Arrays;

public class SelectionSort {

	public static void main(String[] args) {
	int []a= {81,23,45,78,58};
	sort(a);
	for(int n:a) {
		System.out.println(n);
	}

	}

	private static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j]<a[index])
					{
					index=j;
					}
				if(i!=index)
					{
					int temp=a[i];
					a[i]=a[index];
					a[i]=temp;
					
					
					
					//a[j+1]=temp;
					
					}
				
			}
		}
		
	}

}
