package superKeyword;


class A extends Object{
int i;
int j;
public A(int i,int j){
	this.i=i;
	this.j=j;
	
}
@Override
public String toString() {
	return"A[i="+this.i+",j="+this.j+"]";
}
}
class B extends A{

	public B(int i, int j) {
		super(i,j);
		
	
	this.i=i;
	this.j=j;
}
public class test1 {
public static void main(String[]args) {
	System.out.println("89");
}
}}
