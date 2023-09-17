package Java.OOPS.Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Frank");						//Setting the name
		s.setAge(31);							//Setting the age
		System.out.println(s.getName());		//Getting the name
		System.out.println(s.getAge());			//Getting the age
		
	}

}
