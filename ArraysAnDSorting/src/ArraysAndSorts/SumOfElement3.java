package ArraysAndSorts;

public class SumOfElement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= { 
				{1,2,3},
				{4,5,6},
		        {7,8,9}
				    };
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j)sum+=a[i][i];
				
			}
			System.out.println("sum="+sum);
		}
	}

}
