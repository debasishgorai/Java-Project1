package StrngAllPrograms;

public class ReverseEachWords {
	public static void main(String[]args){
		String s= "java is easy";
		String[]arr=s.split("");
		String res=" ";
		for(String str : arr) {
			res+=rev(str);
			res+="";
		}
		res=res.trim();
	System.out.println(res);
		
	}
	static String rev(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		return s1;
	}
		
}
