package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 2, 3, 5 , 1 , -2, -5
				};
		int n = a.length;
		
		for (int i = 0; i < n - 1 ; i++) {
			boolean sorted = true;
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j + 1] < a[j]) {
					int temp = a[j + 1];
					a[j+1] = a[j];
					a[j] = temp;
					sorted = false;
 				}
			}
			if(sorted) break;
		}
		
		for (int item : a) {
			System.out.print(item + " ");
		}

	}

}
