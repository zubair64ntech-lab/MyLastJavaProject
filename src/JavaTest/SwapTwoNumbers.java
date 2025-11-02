package JavaTest;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 25;

		System.out.println("Before swapping: a = " + a + ", b = " + b);

		// Swapping using a temporary variable
		int temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping: a = " + a + ", b = " + b);

	}

}
