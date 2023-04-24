package ArraysAndSorts;

public class FirstArrays {
	public static void main(String[] args) {
		int[]arr= {10,20,30,40};
		m1(arr);
		for(int n: arr) {
			System.out.println(n);
		}

		}
		static void m1(int[]a) {
			for(int i=0;i<a.length;i++) {
				a[i]++;
			}
		}
}
