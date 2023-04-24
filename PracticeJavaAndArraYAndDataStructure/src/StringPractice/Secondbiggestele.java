package StringPractice;

public class Secondbiggestele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {12,67,98,65,78,79};
System.out.println(sort(a));
//sort(a);
	}

	private static int sort(int[] a) {
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
		int temp= a[i];
		a[i]=a[j];
		a[j]=temp;
	}}
	//System.out.println(a);
}
return a[a.length-2];
//System.out.printl(a);
		
	}

}
