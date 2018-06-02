package linkedlist;

import java.util.Scanner;

public class LengthOfLinkedList {
	static Node head;
	
	static class Node {
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public void addNode(int data) { 
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public int lengthOfList(){
		Node temp = head;
		int count = 0; 
		while(temp != null){
			temp = temp.next;
			count++;
		}
		
		return count;
	}
	
	public boolean recursiveSearch(Node head, int x){
		
		if(head == null){
			return false;
		}
		
		
		if(head.data == x){
			System.out.println(x+"  "+head.data);
			return true;
		}
		 
		return recursiveSearch(head.next, x);
	}
	
	public static void main(String sadf[]) {
		LengthOfLinkedList list = new LengthOfLinkedList();
		Scanner in = new Scanner(System.in);
		System.out.println("Number of nodes");
		int n = in.nextInt();
		
		System.out.println("Enter Nodes");
		for(int i=0; i<n; i++){
			list.addNode(in.nextInt());
		}
		
		list.printList();
		System.out.println("Length OF List");
		System.out.println(list.lengthOfList());
		System.out.println("SearchJ");
		System.out.println(list.recursiveSearch(head, 3));
	}
}
