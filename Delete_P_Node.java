package Singly_Linked_List;

import java.util.Scanner;

public class Delete_P_Node {
	
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
	
}
	public ListNode delete_end(int pos) {
		if(pos==1) {
			ListNode temp=head;
			head.next=head;
			return temp;
		}
		else {
			ListNode previous=head;
			int count=1;
			while(count<pos-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			ListNode temp=current;
			previous.next=current.next;
			return temp;
			
		}
	}
	
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" ---> ");
			current=current.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		Delete_P_Node sll= new Delete_P_Node();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third =new ListNode(30);
		ListNode fourth=new ListNode(40);
		ListNode fifth=new ListNode(50);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Position: ");
		int pos=obj.nextInt();
		for(int i=pos; i>0;i--) {
			System.out.println("Deleted: "+sll.delete_end(i).data);
			sll.display();
		}
		
	}

}
