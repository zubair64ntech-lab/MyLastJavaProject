package JavaTest;

public class FindLargestNumber {

	public static void main(String[] args) {

		
		int num1 = 45;
		int num2 = 78;
		int num3 = 32;

		int largest;

		if (num1 >= num2 && num1 >= num3) {
			largest = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			largest = num2;
		} else {
			largest = num3;
		}

		System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);
		
	}

}
