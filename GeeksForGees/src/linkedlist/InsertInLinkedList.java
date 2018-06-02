package linkedlist;

public class InsertInLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void printList(){
		Node n = head;
		
		while(n != null){
			System.out.print(n.data);
			n = n.next;
		}
	}
	
	public void pushHead(int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	public void insertAfter(Node prev_node, int data){
		if(prev_node == null ){
			System.out.println("prev node can't be null");
		}
		
		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
	}
	
	public void insertLast(int data){
		Node n = new Node(data);
		if(head == null){
			 head = n;
			 head.next = null;
		}
		
		n.next = null;
		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		
		last.next = n;
	}
	
	public void deleteNode(int key){
		Node temp = head;
		Node prev = null;
		
		if(temp != null && temp.data == key){
			head = temp.next;
			return;
		}
		
		while(temp != null && temp.data != key) {
			prev = temp;
			System.out.println("PREV "+prev.data);
			temp = temp.next;
			System.out.println("TEMP "+temp.data);
		}
		
		System.out.println("FFFPREV "+prev.data);
		System.out.println("FFFTEMP "+temp.data);
		if(temp == null){
			return;
		}
		
		prev.next= temp.next;
		
	}
	
	public static void main(String asdf[]){
		InsertInLinkedList list = new InsertInLinkedList();
		list.head = new Node(1);
		list.pushHead(2);
		list.insertAfter(list.head.next, 5);
		list.insertLast(6); 
		
		list.printList();
		
		list.deleteNode(5);
		System.out.println();
		list.printList();
	}
}
