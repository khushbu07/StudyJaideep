package Programs.Zz_Basic;

//153 = (1*1*1)+(5*5*5)+(3*3*3)
//371 = (3*3*3)+(7*7*7)+(1*1*1) 
//370
//0
//407

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number = 370;
		int a = 0;
		int c = 0;
		int temp;
		temp = number;
		
		while(temp != 0) {
			a = temp%10;
			c = c+a*a*a;
			temp = temp/10;
		}
		
		if(number==c) {
			System.out.println("Number "+number+" is Armstrong Number");
		}else {
			System.out.println("Number "+number+" is not Armstrong Number");
		}
		
	}

}
