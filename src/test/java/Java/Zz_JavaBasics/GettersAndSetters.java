package Java.Zz_JavaBasics;

public class GettersAndSetters {
	
	String name;
	int age;
		
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public void printDetails() {
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age); 
	}
	
	public static void main(String[] args) {
		
		GettersAndSetters a = new GettersAndSetters();
		a.setName("JD");
		a.setAge(31);
		a.printDetails();
	}
}
