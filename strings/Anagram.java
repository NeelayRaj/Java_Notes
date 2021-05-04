package strings;

public class Anagram {

	public static void main(String[] args) {
		String a = "act";
		String b = "cat";
		boolean anagram = false;
		boolean isVisited[] = new boolean[b.length()];
		
		if (a.length()==b.length()) {
			for(int i=0; i < a.length();i++) {
				anagram = false;
				for(int j=0; j < b.length(); j++) {
					if (b.charAt(j)== a.charAt(i) && !isVisited[j]) {
						isVisited[j] = true;
						anagram = true;
						break;
					}
				}
				if(!anagram) {
					break;
				}
			}
			
		}
		if (anagram == true) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}

	}

}
