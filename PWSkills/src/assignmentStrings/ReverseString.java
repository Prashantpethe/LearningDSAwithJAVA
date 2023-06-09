package assignmentStrings;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string you want to reverse");
		String inputString = scan.next();
		String reversedString ="";
		for(int i=0;i<inputString.length();i++)
		{
			reversedString =inputString.charAt(i)+ reversedString;
		}
		System.out.println("Reversed string is " + reversedString);
		
		
	}

}
