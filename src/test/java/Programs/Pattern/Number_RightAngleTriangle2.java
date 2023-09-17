package Programs.Pattern;

import java.util.Scanner;

//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5 


public class Number_RightAngleTriangle2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Taking rows value from the user    
        System.out.println("Enter the number of rows: ");    
        int rows = sc.nextInt();         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
               
            System.out.println();
        }         
        sc.close();
				
	}
}
