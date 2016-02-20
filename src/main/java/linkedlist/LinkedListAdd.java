package linkedlist;


import java.util.LinkedList;

/**
 * add two numbers which stored in linked list 
 * the lowest digit is the head of list
 * 342 + 471 = 813
 * 2 -> 4 - >3 + 1 -> 7 -> 4 = 3 -> 1 -> 8
 * 
 * time complexity O(N), space complexity O(N)
 * @author Hang
 */
public class LinkedListAdd
{
	public static LinkedList<Integer> add(LinkedList<Integer> s1, LinkedList<Integer> s2)
	{
		LinkedList<Integer> listRet = new LinkedList<>();
		int carry = 0;
		
		while(s1.size() != 0 && s2.size() != 0)
		{
			int sum = s1.poll() + s2.poll() + carry;
			int value = sum % 10;
			carry = sum / 10;
			
			listRet.add(value);
		}
		
//		listRet.addAll(s1.size() != 0 ? s1 : s2);		// didn't consider the highest digit carry scenario
		LinkedList<Integer> listRest = s1.size() != 0 ? s1 : s2;
		while(listRest.size() != 0)
		{
			int sum = listRest.poll() + carry;
			int value = sum % 10;
			carry = sum / 10;
			listRet.add(value);
		}
		
		if(carry != 0)
		{
			listRet.add(carry);
		}
		
		return listRet;
	}
	
	
	public static void main(String[] args){
		LinkedList<Integer> s1 = new LinkedList<Integer>();
		s1.add(2);
		s1.add(4);
		s1.add(3);
		
		LinkedList<Integer> s2 = new LinkedList<>();
		s2.add(1);
		s2.add(7);
		s2.add(6);
		
		
		System.out.println(add(s1, s2));
	}
}
