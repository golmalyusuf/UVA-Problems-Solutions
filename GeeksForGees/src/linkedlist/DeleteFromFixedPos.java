package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteFromFixedPos {

	Node head;
	static class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public void addNode(int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	public void printlist() {
		Node n = head;
		while(n!= null){
			System.out.print(n.data);
			n = n.next;
		}
	}
	
	void deleteNode(int position){
		if(head == null){
			return;
		}
		
		Node temp = head;
		if(position == 0){
			head = temp.next;
			return;
		}
		
		for(int i = 0; temp != null && i< position-1; i++){
			temp = temp.next;
		}
		
		if(temp == null || temp.next == null ){
			return;
		}
		
		Node next1 = temp.next.next;
		temp.next = next1;
		
	}
	public static void main(String[] args) {
		DeleteFromFixedPos list = new DeleteFromFixedPos();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of Nodes");
		int n = in.nextInt();
		
		for(int i=0; i<n; i++){
			int temp = in.nextInt();
			list.addNode(temp);
		}
		
		list.printlist();
		System.out.println("Enter Delete position");
		int num = in.nextInt();
		list.deleteNode(num);
		list.printlist();
		 
	}
}
