package reverse_linkedlist;

/**
 *
 * @author SAM
 */
// Java program for reversing the linked list 

class Reverse_LinkedList { 

	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	Node reverse(Node node) 
	{ 
		Node prev = null; 
		Node current = node; 
		Node next = null; 
		while (current != null) { 
			next = current.next; 
			current.next = prev; 
			prev = current; 
			current = next; 
		} 
		node = prev; 
		return node; 
	} 

	void printList(Node node) 
	{ 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) 
	{ 
		Reverse_LinkedList list = new Reverse_LinkedList(); 
		list.head = new Node(54); 
		list.head.next = new Node(45); 
		list.head.next.next = new Node(14); 
		list.head.next.next.next = new Node(25); 

		System.out.println("Linked list Data"); 
		list.printList(head); 
		head = list.reverse(head); 
		System.out.println(""); 
		System.out.println("Reversed linked list Data "); 
		list.printList(head); 
	} 
} 
