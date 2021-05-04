package strings;

public class ReverseWords {

	public static void main(String[] args) {
		String a = "                                     I Love    Java, The Coffee";
		String b = a.trim();
		String words[] = b.split(" ");
		String Store = "";
		int n = words.length;
		
		for (int i = 0; i < n; i++) {
				if (words[i] == " ") {
				words[i] = null;	
			}
			}
		
		for (int i=0; i < n-1;i++) {
			for(int j = 0; j < n-1;j++) {
				if(words[j]==null) {
					String temp = words[j+1];
					words[j+1]= words[j];
					words[j]=temp;
				}
			}
			
		}

		for (int j = words.length - 1; j >= 0; j--) {
			System.out.print(words[j] + " ");
			}
		
	}
}
