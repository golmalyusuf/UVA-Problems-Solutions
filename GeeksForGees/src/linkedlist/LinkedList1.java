package linkedlist;

public class LinkedList1 {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void printlist(){
		Node n = head;
		while(n != null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	 
	public static void main(String[] args) {
		 LinkedList1 list = new LinkedList1();
		 list.head = new Node(1);
		 Node second = new Node(2);
		 Node third = new Node(3);
		 
		 list.head.next = second;
		 second.next = third;
		 
		 list.printlist();
	}

}
