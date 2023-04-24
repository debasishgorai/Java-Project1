package StrngAllPrograms;

public class StringDemo {
	public static void main(String[] args) {
	String s= "java is lang";
	String[]arr =s.split("");
	String s1="";
	for(String str:arr) {
		s1+=rev(str);
		s1+="";
		s1+=s1.trim();
		
	}
System.out.println(s1);
	}

	private static String rev(String str) {
		// TODO Auto-generated method stub
		return null;
	}
}
