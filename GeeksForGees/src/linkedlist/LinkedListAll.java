package linkedlist;
/*here I added insert delete and update and search and rotate methods*/
public class LinkedListAll {

	Node head;
	class Node {
		Node next;
		int data;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	/*appned to end of the list*/
	public void appendToList(int data){
		Node temp = head;
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
			return;
		}
		
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = new_node;
		return;
	}
	
	/*add Node to the head*/
	public void addNodeToHead(int data) {
		Node temp = head;
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
			return;
		}
		 
		new_node.next = temp;
		head = new_node ;
	}
	public void insertAfter(int pos, int data){
		Node temp = head;
		Node new_node = new Node(data);
		if(head == null){
			return;
		}
		
		int count = 1;
		while(temp != null && count < pos){
			temp = temp.next;
			count++;
		}
		
		System.out.println(temp.data);
		Node nextTemp = temp.next;
		temp.next = new_node;
		new_node.next = nextTemp;
		return;
	}
	
	/*Delete Node From Position*/
	public void deleteNodeForm(int n){
		Node temp = head;
		Node prev = null;
		if(head == null){
			return;
		}
		
		int count = 0;
		while(temp != null && count<n){
			prev = temp;
			temp = temp.next;
			count++;
		}
		prev.next = temp.next;
		return;
	}
	public void printList(){
		Node temp = head;
		
		while(temp != null){
			System.out.print("  "+temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedListAll llist = new LinkedListAll();
		
		llist.appendToList(3);
		llist.appendToList(4);
		llist.addNodeToHead(2);
		llist.addNodeToHead(1);
		
		llist.printList();
		
		llist.deleteNodeForm(2);
		llist.printList();
		
		llist.insertAfter(2,3);
		llist.printList();
		
	}

}
