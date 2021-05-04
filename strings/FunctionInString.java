package strings;

public class FunctionInString {

	public static void main(String[] args) {
		String name = "harsh";
		String anotherName = new String("Harsh raj");
		String name2 = new String("harsh");
		String noName = "";
		String cars = "Ferrari, Audi, Lamborghini, Mercedes, Rolls Royce";
		String trailingSpace = "     harsh         ";
		
		System.out.println(name.charAt(4)); // charAt function 
		
		System.out.println(anotherName.length()); // length function 
		
		System.out.println(name.substring(2)); // substring from initial position using substring function
		
		System.out.println(anotherName.substring(1, 7)); // substring from initial position to final position using substring function
		
		System.out.println(name.contains("harsh")); //find string or character in existing string using substring function
		
		System.out.println(name.equals(name2)); // == is for checking object but this equal function is for checking value of strings
		
		System.out.println(noName.isEmpty()); // isEmpty function is a check for null String
		
		System.out.println(name.concat(" raj")); // concat function is used for adding two string ( + is also valid i.e. name = name + " raj" )
		
		System.out.println(name2.replace('h', 'A')); //replace function is used for replacing character in a string
		
		String allCars[] = cars.split(", "); //Split function is used for Splitting two or many string having common character or string b/w them
		for(String a: allCars) {
			System.out.println(a);
		}
		
		System.out.println(anotherName.indexOf('r')); //indexOf function used for finding character's position.
		
		System.out.println(anotherName.toLowerCase()); //toLowerCase function used for change all upper case to lower case.
		
		System.out.println(anotherName.toUpperCase()); //toUpperCase function used for changing all lower case to upper case.
		
		System.out.println(trailingSpace);
		
		System.out.println(trailingSpace.trim()); // trim function is used for trimming trailing space from any string.
		
		
	}

}
