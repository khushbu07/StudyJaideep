package Java.Loops;

public class zz_ContinueStatement {

	public static void main(String[] args) {

		System.out.println("Example 1:");
		for(int i=1;i<=10;i++){  
			if(i==5){    
				continue;  
			}  
			System.out.print(i + " | ");  
		} 

		System.out.println("");
		System.out.println("-------------------------");
		
		System.out.println("Example 2:");
		for(int i=1;i<=3;i++){    
			for(int j=1;j<=3;j++){    
				if(i==2&&j==2){      
					continue;    
				}    
				System.out.print(i+" "+j + " | ");    
			}    
		}    

	}
}
