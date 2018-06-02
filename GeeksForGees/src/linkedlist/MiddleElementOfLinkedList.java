package linkedlist;

public class MiddleElementOfLinkedList {
	 
	 Node head;   
	 
    class Node {
        int data;
        Node next;
        Node(int d) {
        	data = d; 
        	next = null; 
    	}
    }
	
	public void append(int new_data){
	     Node new_node = new Node(new_data);
	
	     if (head == null)
	     {
	         head = new Node(new_data);
	         return;
	     }
	
	     new_node.next = null;
	
	     Node last = head; 
	     while (last.next != null)
	         last = last.next;
	
	     last.next = new_node;
	     return;
	}
	
	public void printList(){
		Node tnode = head;
		 
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
	} 
	
	public void findMid(){
		Node temp = head;
		
		int count = 0;
		while(temp.next != null){
			count++;
			System.out.println("  ============"+temp.data);
			temp = temp.next;
		}
		count++;
		int i = (int)Math.ceil((double)count/2);
		System.out.println(i);
		
		int count2 =0;
		Node temp2 = head;
		Node mid = null;
		while(temp2.next != null){
			count2++;
			if(count2 == i){
				mid = temp2;
			}
			temp2 = temp2.next;
		}
		System.out.println("DATA IS "+mid.data);
	}
	
	 public static void main(String[] args) {
		MiddleElementOfLinkedList llist = new MiddleElementOfLinkedList();
		llist.append(1);
		llist.append(2);
		llist.append(3);
		llist.append(4);
		llist.append(5);
		llist.append(6);
		llist.append(7);
		
		System.out.println("\nCreated Linked list is: ");
		llist.printList();
		
		System.out.println("\nMID IS  Linked list is: ");
		llist.findMid();
	} 

}
