package Java.OOPS.Encapsulation;

public class Student {
	
	//Variables
	private String name;						//Keeping the variables as private so that the user can not access
	private int age;
	
	//Methods
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
