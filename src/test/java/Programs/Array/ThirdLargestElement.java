package Programs.Array;

public class ThirdLargestElement {

	public static void main(String[] args) {

		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Third Largest: "+getThirdLargest(a));  
		System.out.println("Third Largest: "+getThirdLargest(b));  

	}

	public static int getThirdLargest(int[] a){  
		int temp;  
		int lengthOfArray = a.length;
		for (int i = 0; i < lengthOfArray; i++)   
		{  
			for (int j = i + 1; j < lengthOfArray; j++)   
			{  
				if (a[i] > a[j])   
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		}  
		return a[lengthOfArray-3];  
	}  
}
