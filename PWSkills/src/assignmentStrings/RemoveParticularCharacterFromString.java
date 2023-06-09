package assignmentStrings;

import java.util.Scanner;

public class RemoveParticularCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString = scan.next();
		System.out.println("Enter the character you want to remove");
		String removeCharacter = scan.next();
			System.out.println(inputString.replace(removeCharacter, ""));
		
	}

}
