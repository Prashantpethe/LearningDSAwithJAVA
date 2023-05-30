//Below code is for Assignment3,4 and 5

package arraysAndObjectAssignments;

public class PrintingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array declaration and initialization
		int arr[] = {10,20,30,40,50};
		int sum =0;
		
		//loop to print array values
		System.out.print("Array elements are"+" ");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+ " ");
			//login to store sum of all elements of array
			sum = sum +arr[i];
		}
		//Displaying total sum of array
		System.out.println("\nSum of all elements of java is\t" + sum);
		
		//below code is to get index number of particular element
		int findIndexOfNumer = 30;
		int indexValue=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(findIndexOfNumer == arr[i]) {
				indexValue=i;
				break;
			}
				
		}
		System.out.println("Index of"+" "+ findIndexOfNumer+" " +"is"+" "+ indexValue);
		

	}

}
