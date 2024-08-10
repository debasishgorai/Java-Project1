package PrimeNumber;

public class AllPrime {
public static void main(String[] args) {
	for(int num=2;num<=20;num++) {
		
		int count=0;
		for(int i=2;i<=num/2;i++) {
		//boolean flag=true;
			if(num%i==0) {
				
			//num=num++;
				//flag=false;
				count++;
				break;
			}
		}
		if(count==0) {
		System.out.println(num);
	}
	}

	}
}
