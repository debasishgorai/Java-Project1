package PrimeNumber;

public class SumOFAllPrime {
public static void main(String[] args) {
//int num=20;
int sum = 0,count=0;
for(int num=1;num<=20;num++) {
	
count=0;
for(int i=2;i<=num/2;i++) {
//boolean flag=true;
	if(num%i==0) {
		
		count++;
		break;
	}
}
	
	if(count==0&num!=1) {
		sum+=num;
		
	}
	
}
System.out.println(sum);
}
}