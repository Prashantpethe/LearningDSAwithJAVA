package assignmentStrings;

import java.util.Scanner;

public class ChangeUpperToLowerAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString = scan.next();
		
		System.out.println("Upper case of String is "+ inputString.toUpperCase());
		System.out.println("Lower case of String is "+inputString.toLowerCase());
	}

}
