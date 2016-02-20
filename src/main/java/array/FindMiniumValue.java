package array;

/**
 * Find the minimum value in an rotated array
 * The array is originally sorted.
 * @author Hang
 *
 * e.g: 
 * original: [1, 3, 4, 5, 7, 8]
 * rotated: [4, 5, 7, 8, 1, 3]
 * output: 1
 * 
 * time complexity O(logN) space complexity O(1)
 */

public class FindMiniumValue
{
	static int searchMin(int[] src, int left, int right)
	{
		if(src[right] > src[left]) return src[left];
		
		int mid = (right + left) / 2;
		if(right == left + 1) return src[right];
		
		if(src[mid]> src[left])
		{
			return searchMin(src, mid, right);
		}
		else {
			return searchMin(src, left, mid);
		}
		
	}
	
	public static void main(String[] args)
	{
//		int[] a = {3, 4, 5, 6, 1, 2};
		int[] a = {3, 4, 5, 6, 7, 8, 1, 2};
		System.out.println(searchMin(a, 0, a.length - 1));
	}
}
