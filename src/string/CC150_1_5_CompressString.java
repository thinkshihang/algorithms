package string;

/**
 * CC150_1_5
 * 
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not 
 * become smaller than the original string, your method should return the original string.
 * 
 * Suppose StringBuffer is allowed to use.
 * 
 * @author Hang
 * 
 * time complexity O(N)
 * space complexity O(N)
 */
public class CC150_1_5_CompressString
{
	public static String compress(String str)
	{
		StringBuffer sb = new StringBuffer();
		
		char last = str.charAt(0);
		int count = 1;
		
		for(int i = 1; i < str.length(); ++i)
		{
			if(str.charAt(i) == last)
			{
				count++;
			}
			else
			{
				sb.append(last);
				sb.append(count);
				
				last = str.charAt(i);	// change last to next different char
				count = 1;	// change count back to 1
			}
		}
		
		sb.append(last);	// insert the last part of str
		sb.append(count);	// insert the number of last part of str
		
		String compressedStr = new String(sb);
		
		if(str.length() <= compressedStr.length())
		{
			return str;
		}
		else
		{
			return compressedStr;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(CC150_1_5_CompressString.compress("aaabccccaaa"));
		System.out.println(CC150_1_5_CompressString.compress("abcddddddd"));
	}
}
