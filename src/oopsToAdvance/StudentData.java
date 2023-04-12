package oopsToAdvance;

class Student6{
	int id;
	String name;
	int age;
	public void addStudents(int id,String name,int age) {
		this.id= id;
		this.name= name;
		this.age = age ;
	}


	public void displayStudents() {
		System.out.println("student  id:"+this.id);
		System.out.println("student name:"+this.name);
		System.out.println("student  age:"+this.age);

	}}

public class StudentData {

	public static void main(String[] args) {
		 Student6 s1 = new Student6();
		 s1.addStudents(1, "Debasish", 22);
		 s1.displayStudents();
		 
		 Student6 s2 = new Student6();
		
		s2.addStudents(2, "Subhasish",23);
		 s2.displayStudents();
		 
		 Student6 s3 = new Student6();
		 s3.addStudents(3,"Ram", 27);
		 s3.displayStudents();
		 
		 Student6 s4 = new Student6();
		 s4.addStudents(4, "Ram", 23);
		 s4.displayStudents();

	}

}
