package Programs.Pattern;

//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
//A B C D E F


public class Alphabet_RightTriangle {

	public static void main(String[] args) {

		int alphabet = 65;
		for (int i = 0; i <= 5; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}

	}

}
