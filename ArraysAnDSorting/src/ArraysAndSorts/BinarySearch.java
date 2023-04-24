package ArraysAndSorts;

public class BinarySearch {
	public static void main(String[] args) {
        int[]a= {7,43,45,65,78};
        System.out.println(search(a,65));

}
public static int search(int[]a,int ele) {
	int start=0,end=a.length-1,mid;
	while(start<=end) {
		mid=(start+end)/2;
		if(ele==a[mid]) return mid;
		else if(ele<a[mid]) end=mid-1;
		else start =mid+1;
		
		
	}
	return -1;
}
}
