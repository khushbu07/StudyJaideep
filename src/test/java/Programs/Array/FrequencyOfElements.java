package Programs.Array;

public class FrequencyOfElements {

	public static void main(String[] args) {
		
		int[] myArray = new int[] {2,3,4,2,3,1,2,5,3,4,2};
		int[] arrFreq = new int[myArray.length];			//Array arrFreq will store frequencies of element
		
		int visited = -1;
		
		for(int i=0; i<myArray.length; i++) {
			int count = 1;
			for(int j=i+1; j<myArray.length; j++) {
				if(myArray[i] == myArray[j]) {
					count++;
					arrFreq[j] = visited;
				}
			}
			
			if(arrFreq[i] != visited) {
				arrFreq[i] = count;
			}
		}
		
		System.out.println("Element frequency!");
		
		for(int i=0; i<arrFreq.length; i++) {
			if(arrFreq[i] != visited) {
				System.out.println(myArray[i]+" "+arrFreq[i]);
			}
		}
	}
}
