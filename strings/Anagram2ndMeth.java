package strings;

public class Anagram2ndMeth {

	public static void main(String[] args) {
	String a = "silent";
	String b = "litsen";
	
	int al[] = new int[256];
	int bl[] = new int[256];
	boolean isAnagram = true;
	for(char c: a.toCharArray()) {
		int index = (int) c;
		al[index]++;
	}
	for (char c: b.toCharArray()) {
		int index = (int) c;
		bl[index]++;
	}
	
	
	for(int i=1; i < 256; i++) {
		if(al[i] != bl[i]) { 
			isAnagram = false;
			break;
			}
		}
		
	if (isAnagram) {
		System.out.println("Anagram");
	}else {
		System.out.println("not Anagram");
	}

	}

}
