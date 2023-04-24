package StringPractice;

public class SecondBiggest {

	public static void main(String[] args) {
		int []a= {12,52,89,58};
		//System.out.println("second biggest"+a[i]);
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				//System.out.println("second biggest"+a[i]);
			}
			
		}
		
			System.out.println(a[i]+"second biggest");}

	}
}

