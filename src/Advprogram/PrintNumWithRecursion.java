package Advprogram;

public class PrintNumWithRecursion {
public static void main(String[]args) {
	
	display(1);
	

}
static void display(int i) {
	if(i>65) return;
	System.out.println(i);
	display(i+1);
}
}
