package ObjectpackToString;

class Student{
	
	int id;
	String name;
	int age;
	public Student(int id,String name,int age) {
		this.id= id;
		this.name= name;
		this.age = age ;
	}
	@Override
	public String toString() {

	String info="Student[id="+id+",name="+name+",age="+age+"]";
	return info;
	}
}
public class StudentInfo {

	public static void main(String[] args) {
		
Student s1= new Student(1,"gtt",8);
System.out.println(s1);
Student s2= new Student(2, "dev", 9);
System.out.println(s1.equals(s2));

	}

}
