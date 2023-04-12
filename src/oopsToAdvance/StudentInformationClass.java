package oopsToAdvance;
class Student{
	int id;
	String name;
	int age;
	String gender;
	String phno;
	static String StudentCollegeName;
	static String StudentCollegeAddress;
	public void addStudents(int id,String name,int age,String gender,String phno) {
		this.id= id;
		this.name= name;
		this.age = age;
		this.gender=gender;
		this.phno=phno;
	}
	public void displayStudents() {
		System.out.println("student  id:"+this.id);
		System.out.println("student name:"+this.name);
		System.out.println("student  age:"+this.age);
		System.out.println("student  gender:"+this.gender);
		System.out.println("student  phno:"+this.phno);
		System.out.println("student  CollegeName:"+StudentCollegeName);
		System.out.println("student  CollegeAddress:"+StudentCollegeAddress);
		System.out.println("*************");
		
	}
	public static void changeCollegeName(String StudentCollegeName ) {
		Student.StudentCollegeName = StudentCollegeName;
		
	}
	public static void changeCollegeAddress(String StudentCollegeAddress ) {
		Student.StudentCollegeAddress = StudentCollegeAddress;
		
	}
	
	
}

public class StudentInformationClass {
	public static void main(String[]args) {
		Student.StudentCollegeAddress = "OAR";
		Student.StudentCollegeName = " JSP";
		 Student s1 = new Student();
		 s1.addStudents(1, "Debasish", 22, "male", "7319514868");
		 s1.displayStudents();
		 
		 Student s2 = new Student();
		 s2.addStudents(2, "Subhasish", 24, "male", "8597489154");
		 s2.displayStudents();
		 
		 Student s3 = new Student();
		 s3.addStudents(3, "Sudip", 21, "male", "9382604450");
		 s3.displayStudents();
		 
		 Student s4 = new Student();
		 s4.addStudents(4, "Ram", 23, "male", "7319948680");
		 s4.displayStudents();
		 
		 Student.changeCollegeName("Jspiders");
		 Student.changeCollegeAddress("Marathali");
		 s1.displayStudents();
		 s2.displayStudents();
		 s3.displayStudents();
		 s4.displayStudents();
	}

	
}






















