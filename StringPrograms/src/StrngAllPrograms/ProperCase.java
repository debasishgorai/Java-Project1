package StrngAllPrograms;

public class ProperCase {
	public static void main(String[]args) {
		String s1= "javA iS easY";
		String s2="";
		String[]a=s1.split("");
		for(String s:a) {
			s2+=s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
			s2+="";
		}
			s2=s2.trim();
			System.out.println(s2);
		}
		
		

}
