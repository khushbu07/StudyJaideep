package Java.OOPS.Class.toString;

public class Student {
	
	int studentID;
	String name;
	
	Student(int studentID, String name){
		this.studentID = studentID;
		this.name = name;
	}
	
	public String toString() {
		return studentID + " " + name;
	}

}
