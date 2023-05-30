//Below code is fot Assignment 1 and Assignment2
package arraysAndObjectAssignments;


public class ExampleForMethodOverloading {

	void sumOfNumbers(int number1, int number2) {
		System.out.println(number1 + number2);
	}

	void sumOfNumbers(double number1, double number2, double number3) {
		System.out.println(number1 + number2 + number3);
	}

	void sumOfNumbers(String number1, String number2) {
		System.out.println(number1 + number2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleForMethodOverloading myObject = new ExampleForMethodOverloading();
		myObject.sumOfNumbers("10", "20");
		myObject.sumOfNumbers(10, 20);
		myObject.sumOfNumbers(10.5, 20.5, 33.3);

	}

}
