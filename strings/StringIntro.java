package strings;

public class StringIntro {

	public static void main(String[] args) {
		String name = "harsh";
		String name2 = "harsh";
		String anotherName = new String("harsh");
		System.out.println(name == name2);
		System.out.println(name == anotherName);
		System.out.println(name);
		name = "harsh raj"; // this name will not replace old one just make a new copy i.e. old string also available in memory.
		
		

	}

}
