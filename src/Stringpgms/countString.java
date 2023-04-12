package Stringpgms;

import java.util.Scanner;

public class countString {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String s= sc.nextLine();
		String temp="";
		for(int i=0;i<=temp.length();i++) {
			char c= s.charAt(i);
			if(!temp.contains(c+"")) {
				temp+=c;
				
			}
			System.out.println(temp);
		
		
		}
	for(int i=0;i<s.length();i++) {
			
			char c= s.charAt(i);
			String s1=s.replace(c+"", "");
			int count = s.length()-s1.length();
			System.out.println(c+":no of time:"+count);
		}

		
	
	}
	

	}
