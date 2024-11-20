package Linked_list;

public class Main {

	public static void main(String[] args) {
		
		Node node1 = new Node(12);
		System.out.println(node1.data + " " + node1.next);
		
		Node node2 = new Node(14);
		node1.next = node2;
		
		Node node3 = new Node(16);
		node2.next = node3;
		
		System.out.println(node1.next.next.data);

	}

}
