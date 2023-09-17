package Java.Loops;

public class loop_Nested {

	public static void main(String[] args) {

		//Two-Dimensional Array
		String[][] colors = {{"Red", "Blue", "Green"}, {"Cyan", "Magenta", "Purple"}};

		for(int row=0; row<2; row++) {
			for(int col=0; col<3; col++) {
				System.out.print(colors[row][col] + "\t");
			}
			System.out.println();
		}

	}
}
