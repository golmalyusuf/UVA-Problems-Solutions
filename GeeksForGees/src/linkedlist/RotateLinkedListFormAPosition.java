package linkedlist;

import linkedlist.ReverseALinkedList.Node;

public class RotateLinkedListFormAPosition {

	Node head;
	
	class Node {
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void appedToList(int data){
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
		// head = temp;
		return;
	}
	
	public void printlist(){
		Node temp = head;
		
		while(temp != null){
			System.out.println("TEMP "+temp.data);
			temp = temp.next;
		}
	}
	
	public void rotateFromPosition(int n){
		Node temp = head;
		if(head == null){
			return;
		}
		
		if(head.next == null){
			return;
		}
		
		int count = 0;
		while(temp.next != null){
			temp = temp.next;
			count++;
			if(count+1 == n){
				break;
			}
		}
		
		System.out.println(temp.data+" "+count);
		
		Node temp2 = temp;
		//temp.next = null;
		 
		while(temp.next != null){
			temp = temp.next;
		}
		 
		temp.next = head;
		head = temp2.next;
		temp2.next = null;
		return;
	}
	/*Here if list is 1 2 3 4 5 6 7 8 9 and if n = 3
	  then  gorup will be (123) (456) (789)
	  and it will return 3 2 1 6 5 4 9 8 7
	*/
	public void reverseInGroups(int group){
		 Node temp = head;
		 if(head == null || head.next == null){
			 return;
		 }
		 
		
		 while(temp!=null) {
			 int count = 0;
			 Node prev = null;
			 Node current = temp;
			 Node next = null;
			 while(current != null && count < group) {
				 count++;
				 next = current.next;
				 current.next = prev;
				 prev = current;
				 current = next;
				 System.out.println(count+" "+current.data+" "+prev.data);
			 }
			if(prev.next != null){
			 temp = prev.next;
			 System.out.println("===>>"+temp.data);
			} else{
				break;
			}
		 }
	}
	
	public static void main(String[] args) {
		RotateLinkedListFormAPosition llist = new RotateLinkedListFormAPosition();
		llist.appedToList(1);
		llist.appedToList(2);
		llist.appedToList(3);
		llist.appedToList(4);
		llist.appedToList(5);
		llist.appedToList(6);
		
		//llist.printlist();
		
		//llist.rotateFromPosition(3);
		llist.reverseInGroups(3);
		llist.printlist();
	}

}
