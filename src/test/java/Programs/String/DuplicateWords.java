package Programs.String;

public class DuplicateWords {

	public static void main(String[] args) {

		String myString = "Big black bug bit a big black dog on his big black nose";
		myString = myString.toLowerCase();

		String[] words = myString.split(" ");
		int count;

		for(int i=0; i<words.length; i++) {
			count = 1;
			for(int j=i+1; j<words.length; j++) {
				if(words[i] == words[j]) {
					count++;
					words[j] = "0";
				}
			}

			if(count>1 && words[i]!="0") {
				System.out.println(words[i]);
			}
		}

	}

}
