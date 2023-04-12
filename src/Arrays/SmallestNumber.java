package Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		int[]a= {2,3,4,5};
		int small= a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<small) small=a[i];
		}
		System.out.println(small);

	}

}
