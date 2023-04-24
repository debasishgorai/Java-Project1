package ArraysAndSorts;

public class BinarySearchWithRecursion {

	public static void main(String[] args) {
		int[]a= {3,4,7,12,14};
		int index=search(a,12,0,a.length-1);
		System.out.println(index);
		index = search(a,5,0,a.length-1);
		System.out.println(index);

	}
	 public static int search(int[]a,int ele,int start,int end) {
		int mid= (start+end)/2;
		if(start>mid)return -1;
		//int mid=(start+end)/2;
		if(ele==a[mid]) {
			return mid;
		}
		else if(ele<a[mid]) {
			return search(a,ele,start,mid-1);
		}
		else {
			return search(a,ele,mid+1,end);
			
		}
	}
}
