package assignmentStrings;

import java.util.Scanner;

public class IndexOfSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString = scan.next();
		
		System.out.println("Enter substring");
		String subString = scan.next();
		System.out.println("Starting Index of Substring is " + inputString.indexOf(subString));

	}

}
