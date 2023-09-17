package Java.Zz_JavaBasics;

//"this" keyword refers to the class name (ThisKeyword)

public class ThisKeyword {
	
	String food;
	char size;
	
	/*
	 * To avoid using this keyword, we need to change the variable names
	 * Example:
	 * String meal;
	 * String quantity
	 * 
	 * refer the code in the setData method
	 */
	
	
	public void setData(String food, char size) {
		this.food = food;								//this keyword can not be used inside a static method
		this.size = size;
//		meal = food;
//		quantity = size;
	}
	
	public static void main(String[] args) {
		
		ThisKeyword t = new ThisKeyword();
		t.setData("Salad", 'L');
		System.out.println(t.food);
		System.out.println(t.size);
//		System.out.println(t.meal);
//		System.out.println(t.quantity);
	}
	
}
