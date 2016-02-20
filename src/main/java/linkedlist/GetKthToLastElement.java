package linkedlist;

/**
 * get the last K elements in linked list
 * @author Hang
 *
 * time complexity O(N)
 * space complexity O(1)
 */
public class GetKthToLastElement
{
	public static Node getKthToLast(Node head, int k)
	{
		Node p1 = head;
		Node p2 = head;
		
		int count = 1;
		while(count < k)
		{
			p2 = p2.next;
			if(count++ >= k && p2 == null)
			{
				return null;
			}
		}
		
		while(p2.next != null)
		{
			p2 = p2.next;
			p1 = p1.next;
		}
		
		return p1;
	}
	
	public static void main(String[] args)
	{
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(2);
		Node n4 = new Node(4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		
		
		System.out.println(getKthToLast(n1, 3).data);
		System.out.println(getKthToLast(n1, 2).data);
		System.out.println(getKthToLast(n1, 1).data);
		System.out.println(getKthToLast(n1, 4).data);
	}
}
