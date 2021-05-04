package arrays;

import java.lang.reflect.Array;

public class ArrayIntro {

	public static void main(String[] args) {
//		int[] marks = new int[5];
		
//		int[] marks;
//		marks = new int[10];
		
		
		int [] marks , RollNo;
		marks = new int[5];
		RollNo = new int[10];
		
//        int random[] = new int[15], click[] = new int[10];
	    int [] age = {12 , 32 , 34 , 18 , 28};
        marks[1] = 9;
        
        System.out.println(marks[1]);
        for (int i = 0; i < age.length; i++) {
        	System.out.println(age[i]);
        }
	}

}
