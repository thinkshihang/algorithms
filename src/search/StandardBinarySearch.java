package search;

/**
 * Standard binary search implementation
 * 
 * @author Hang
 *
 * time complexity O(logN)
 * space complexity O(1)
 */
public class StandardBinarySearch
{
	
	public static boolean binaryResearch(int[] data, int key)
	{
		int left = 0, right = data.length - 1;
		while(right >= left)
		{
			int mid = (left + right) / 2;
			if(data[mid] == key) return true;
			else if (data[mid] > key ) right = mid - 1;
			else left = mid + 1;
		}
		
		return false;
	}
	
	public static void main(String[] args){
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
		if(binaryResearch(data, 9))
		{
			System.out.println("found");
		}
		else 
		{
			System.out.println("not found");
		}
	}
}
