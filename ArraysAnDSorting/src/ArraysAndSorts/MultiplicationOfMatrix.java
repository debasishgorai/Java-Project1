package ArraysAndSorts;

public class MultiplicationOfMatrix {
	public static void main(String[] args) {
		int [][]a= {{1,2,2},{2,2,1},{1,1,1}};
		int [][]b= {{2,1,2},{1,2,1},{1,1,1}};
		int[][]c=new int[a.length][a.length];
		multiply(a,b,c);
		
		for(int[]temp:c) {
			for(int n:temp) {
				System.out.print(n+"\t");
			}
			System.out.println();
			
		}
	}

	private static void multiply(int[][] a, int[][] b, int[][] c) {
	int len=a.length;
	       for(int i=0;i<len;i++) {
	    	   for(int j=0;j<len;j++) {
	    		   int sum=0;
	    		   for(int k=0;k<len;k++) {
	    			   sum+=a[i][k]*b[k][j];
	    			   
	    		   }
	    		   c[i][j]=sum;
	    	   }
	       }}
		
}
