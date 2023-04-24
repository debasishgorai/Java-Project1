package ObjectPack.Clonepack;

import java.util.Objects;

class Student implements Cloneable{
	int id;
	String name;
	int age;
	public  Student(int id,String name,int age) {
		this.id= id;
		this.name= name;
		this.age = age ;
	}
	@Override
	public String toString() {
		return "Student[id="+id+",name="+name+",age="+age+"]";
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student))return false;
		Student s = (Student)obj;
		return age==s.age && id==s.id && Objects.equals(name, s.name);
	}
	@Override 
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class CloningStudent {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1= new Student(1,"dev",22);
		System.out.println(s1);
		Student s2= (Student)s1.clone();

	}

}
