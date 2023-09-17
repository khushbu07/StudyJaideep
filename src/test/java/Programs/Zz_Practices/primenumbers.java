package Programs.Zz_Practices;

public class primenumbers {
	
	public static void main(String[] args) {
		
		int i, num;
		String primeNumbers = "";
		
		for(i=1; i<=100; i++) {
			int counter = 0;
			
			for(num=i; num>=1; num--) {
				if(i%num == 0) {
					counter++;
				}
			}
			
			if(counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
			
		}
		
		System.out.println("List of Prime Numbers are: "+primeNumbers);
	}
	
}
