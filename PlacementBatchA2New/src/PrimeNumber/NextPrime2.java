package PrimeNumber;

public class NextPrime2 {
	public static void main(String[] args) {
		System.out.println(nextPrime(3));
	}
static 	int nextPrime(int M) {
	boolean flag =true;
	    while(isPrime(M)) {
	    	M=nextPrime(M++);
	    	flag=false;
	 //M++;    // no need ++M; as I already added in the isPrime method's parameter. 
	    } //return M;
		return M;
	}
	static boolean isPrime(int M) {
	    for(int i = 2; i <= M; i++)
	        if(M % i == 0) 
	            return false;
	    return true;
	}
}
