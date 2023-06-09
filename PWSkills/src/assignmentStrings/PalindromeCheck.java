package assignmentStrings;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString = scan.next();
		String reversedString ="";
		for(int i=0;i<inputString.length();i++)
		{
			reversedString =inputString.charAt(i)+ reversedString;
		}
		if(inputString.equalsIgnoreCase(reversedString))
		{
			System.out.println("Entered String is Palindrome");
			
		}
		else
			System.out.println("Entered String is not palindrome");
	}

}
