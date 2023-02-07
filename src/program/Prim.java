package program;

public class Prim {
	// number is greater than 1
	// number is divided by 1 and itself...

	public static void main(String[] args) {

		/*
		 * int num = 6; int count = 0; if (num > 1) { for (int i = 1; i <= num; i++) {
		 * if (num % i == 0) count++;
		 * 
		 * } if (count == 2) { System.out.println("prime number"); }
		 * 
		 * else { System.out.println("is not a palindrom"); } } else {
		 * System.out.println("is not a primenumber"); }
		 * 
		 * 
		 * 
		 */
		// extract even and odd num from given arrya
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		System.out.println("print all even numbers....");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)

				System.out.println(arr[i]);

		}
		System.out.println("print all odd numbers....");
		for (int i1 = 0; i1 < arr.length; i1++) {
			if (arr[i1] % 2 != 0)

				System.out.println(arr[i1]);

		}

	}
}
