package loops;

public class Continue {

	public static void main(String[] args) {
	
		for (int a = 1; a <= 100; a++) {
			if (a >= 40 && a <= 50)
				continue; //It is used to Skip Some element and Then Continue the Loop.
			System.out.println(a);
		}

	}

}
