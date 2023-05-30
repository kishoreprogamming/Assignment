import java.util.*;
class Sort
{
     int binarySearch(int array[], int element, int low, int high) 
{
    while (low <= high) 
    {
      int mid = low + (high - low) / 2;
      if (array[mid] == element)
      {
        return mid;
      }
      if (array[mid] < element)
      {
        low = mid + 1;
      }
      else
      {
        high = mid - 1;
      }
    }
    return -1;
  }
}  
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Sort obj = new Sort();
	    int[] array = { 1,4,5,6,7,8,9,10,11 };
	    int n = array.length;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter element to be searched:");
	    int element = input.nextInt();
	    input.close();
	    int result = obj.binarySearch(array, element, 0, n - 1);
	    if (result == -1)
	      System.out.println("Not found");
	    else
	      System.out.println("Element found at index " + result);
	}
}
