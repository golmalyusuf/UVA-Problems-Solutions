package linkedlist;

import java.util.Scanner;

public class ReverseALinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void addNode(int data){
		Node temp = head;
		Node new_node = new Node(data);
		new_node.next = null;
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
	public void printlist(){
		Node temp = head;
		
		while(temp != null){
			System.out.println("TEMP "+temp.data);
			temp = temp.next;
		}
	}
	public void reverseList(){
		Node node = head;
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head =  prev;
        return;
	}
	
	public static void main(String asdf[]){
		
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0){
			ReverseALinkedList llist = new ReverseALinkedList();
			int n = in.nextInt();
			
			for(int i=0; i<n; i++){
				int val = in.nextInt();
				llist.addNode(val);
			}
			 
			llist.reverseList();
			llist.printlist();
		}
		 
		 
		
	}
}
