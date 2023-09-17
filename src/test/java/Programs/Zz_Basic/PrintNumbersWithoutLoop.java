package Programs.Zz_Basic;

public class PrintNumbersWithoutLoop {

	public static void main(String[] args) {

		printNos(10);

	}

	static void printNos(int n)
	{
		if(n > 0)
		{
			printNos(n - 1);
			System.out.print(n + " ");
			
		}

	}

}
