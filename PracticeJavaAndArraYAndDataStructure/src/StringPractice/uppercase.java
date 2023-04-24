package StringPractice;

public class uppercase {

	public static void main(String[] args) {
    String s1= "i am bangalore";
    String s2= "";
    
   String []a=s1.split("");
   for(String s:a) {
	   s2+=s.substring(0,1).toUpperCase();
	   //s2+=s.substring(0,1).toUpperCase()+s.substring(0,2).toUpperCase()+s.substring(0,4).toUpperCase();
   s2+="";    //sSystem.out.println(s2.substring(0,1).toUpperCase());
   }
   s2=s2.trim();
   System.out.println(s2);
	}

}
