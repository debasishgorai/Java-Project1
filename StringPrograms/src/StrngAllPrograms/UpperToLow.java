package StrngAllPrograms;

public class UpperToLow {

	public static void main(String[] args) {

      String s="KaTtAPpa";
      
        String temp="";
      for(int i=0;i<s.length();i++) {
    	  char ch1=s.charAt(i);
    	 // char ch2='';
		if(ch1>='A'&& ch1<='Z') {
    		  ch2=(char)(ch1+32);
    	  }
    	  else if((ch1>='a'&& ch1<='z')) {
    		  ch2= (char)(ch1-32);
    		  
    	  }
    	  temp+=ch2;
    	  
      }
System.out.println(temp);
	}

}
