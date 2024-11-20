package Linked_list;

public class LinkedList {
	
	Node head = null;
	
	public void insertAtBegining(int item) {
		Node newNode = new Node(item);
		
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next = head.next;
		head = newNode;
	}
	
	public void insertAtEnd(int item) {
		Node newNode = new Node(item);
		
		if(head==null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		temp.next = newNode;
		
	}

	public void insertAtPosition(int item, int position) {
		
	}
}
