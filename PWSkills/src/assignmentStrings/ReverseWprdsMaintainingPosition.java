package assignmentStrings;

public class ReverseWprdsMaintainingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String initialInput ="Think Twice";
		int nextIndex=0;
		String reverseString="";
		String outputString="";
		String finalString="";
		for(int i=0;i<initialInput.length();i++)
		{
			if(initialInput.charAt(i)==' ')
			{
				for(int j=nextIndex;j<i;j++)
				{
					reverseString = initialInput.charAt(j)+reverseString;
					nextIndex=i+1;
				}
				outputString = outputString + reverseString +" ";
				reverseString="";
			}
		}
		for(int k=nextIndex;k<initialInput.length();k++)
		{
			reverseString = initialInput.charAt(k)+reverseString;
		}
		finalString = outputString + reverseString;
		
		System.out.println("Reversed String with maintaining position is " + finalString);
		
	}

}
