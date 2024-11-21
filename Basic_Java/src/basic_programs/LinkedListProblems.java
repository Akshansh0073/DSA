package basic_programs;

import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListProblems {

	public static void main(String[] args) {
		
		Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);
        
        Node middle = findMiddle(head);
        System.out.println("Middle element is: " + (middle != null ? middle.data : "None"));
        
        Node head3 = sortedList(head);
        printList(head3);
        
        System.out.print("Original List: ");
        printList(head);

        // Delete the linked list
        Node head1 = deletedList(head,5);
           
        // Reverse the linked list
        head = reverseList(head);

        // Print reversed list
        System.out.print("Reversed List: ");
        printList(head);
        
        System.out.print("Deleted List: ");
        printList(head1);

	}

	private static Node sortedList(Node head) {
//		ArrayList <Integer> dataList = new ArrayList();
//		Node temp = head;
//		while(temp!=null) {
//			dataList.add(temp.data);
//			temp = temp.next;
//		}
//		Collections.sort(dataList);
//		 temp = head;
//		for(int data:dataList) {
//			temp.data = data;
//			temp=temp.next;
//		}
//		return head;
		
		ArrayList <Integer> data = new ArrayList<>();
		Node temp =head;
		while(temp!=null) {
			data.add(temp.data);
			temp=temp.next;
		}
		
		Collections.sort(data);
		temp = head;
			for(int i=0;i<data.size();i++) {
				temp.data = data.get(i);
				temp=temp.next;
			}
		
		return head;
		
	}

	private static Node deletedList(Node head,int target) {
		
		if (head == null) return null;
		if(head.data==target) return head.next;
		
		Node prev = null;
		Node curr = head;
		while(curr != null && curr.data != target) {
			prev = curr;
			curr=curr.next;
		}
		
		if(curr!=null) {
			prev.next = curr.next;
		}
		return head;
//		if (head == null) return null;
//
//        // If the target node is the head
//        if (head.data == target) {
//            return head.next; // Move head to the next node
//        }
//
//        // Traverse the list to find the target node
//        Node prev = null;
//        Node curr = head;
//
//        while (curr != null && curr.data != target) {
//            prev = curr;
//            curr = curr.next;
//        }
//
//        // If the target node is found, adjust the pointers
//        if (curr != null) {
//            prev.next = curr.next;
//        }
//
//        return head; 
	}

	private static Node reverseList(Node head) {
		
		ArrayList <Node> nodes = new ArrayList();
		Node temp=head;
		while(temp!=null) {
			nodes.add(temp);
			temp = temp.next;
		}
		
		for(int i=nodes.size()-1;i>0;i--) {
			nodes.get(i).next = nodes.get(i-1);
		}
		nodes.get(0).next = null;
		return nodes.get(nodes.size() - 1); 
	}

	private static void printList(Node head) {
		Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
		

	private static Node findMiddle(Node head) {
		
		if(head==null) return null;
		
		int count =0;
		Node temp=head;
		while (temp!=null) {
			temp = temp.next;
			count++;
		}
		
		int n=count/2;
		temp = head;
        for (int i = 0; i < n; i++) {
            temp = temp.next;
        }

        return temp;
	}

}
