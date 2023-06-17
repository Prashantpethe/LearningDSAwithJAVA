package assignmentStrings;
import java.util.*;
public class SortString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter input string");
        String inputString = scan.next();
        
        char[] characterArray = inputString.toCharArray();
        
        for(int i=0;i<characterArray.length;i++)
        {
        	for(int j=i;j<characterArray.length;j++)
        	{
        		if(characterArray[j]<characterArray[i])
        		{
        			char temp =characterArray[i];
        			characterArray[i]=characterArray[j];
        			characterArray[j]=temp;
        		}
        	}
        }
        
        	System.out.println("Alphabetically sorted String is "+ String.valueOf(characterArray));
        
        
        
        
	}

}
