package exercisedevelopers;
class Human{
	String name;
	int age;
	String gender;
	public Human(String name,int age,String gender) {
		super();
		this.name= name;
		this.age = age;
		this.gender= gender;
		
	}
	@Override
	public String toString() {
		return "Human[name="+name+",age="+age+",gender="+gender+"]";
		
	}
}
class Doctor extends Human{
	String specialist;
	public Doctor(String name,int age,String gender,String specialist) {

	super(name,age,gender);
		this.specialist=specialist;
	
		
	}
	@Override
	public String toString() {
		return "Doctor[name="+name+",age="+age+",gender="+gender+",specialist="+specialist+"]";
	}
}
public class DoctorHistory {
	public static void main(String[]args) {
		Doctor doctor1 =new Doctor("Debasish",23,"male","cracker");
		System.out.println(doctor1);
	}

}
