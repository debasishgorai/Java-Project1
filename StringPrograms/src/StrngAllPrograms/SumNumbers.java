package StrngAllPrograms;

public class SumNumbers {
	public static void main(String[] args) {
		
String s="More123hap4py";
int sum=0;
       for(int i=0;i<s.length();i++) {
    	   char ch=s.charAt(i);
    	   if(ch>='0'&& ch<='9') {
    		   int num=ch-48;
    		   sum+=num;
    		   
    	   }
       }
       System.out.println(sum);
	}

}
