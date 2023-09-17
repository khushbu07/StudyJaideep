package Java.Loops;

public class loop_SwitchCase {

	public static void main(String[] args) {
		
		int day = 7;
		String color = "Red";
		
		//If Case
		System.out.println("If Condition:");
		if(day==1) {
			System.out.println("Day is: Sunday");
		}else if(day==2) {
			System.out.println("Day is: Monday");
		}else if (day==3) {
			System.out.println("Day is: Tuesday");
		}else {
			System.out.println("Day is: Unknown");
		}
		
		System.out.println("--------------------------");
		
		//Switch Case
		System.out.println("Switch Case Condition:");
		switch(color){
		case "Red":
			System.out.println("Color is: Red");
			break;
		case "Green":
			System.out.println("Color is: Green");
			break;
		case "Blue":
			System.out.println("Color is: Blue");
			break;
		default:
			System.out.println("Color is: Unknown");
		}

	}

}
