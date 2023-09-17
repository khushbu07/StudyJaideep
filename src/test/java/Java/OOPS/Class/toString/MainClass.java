package Java.OOPS.Class.toString;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "JD");
		Student s2 = new Student(2, "SS");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
