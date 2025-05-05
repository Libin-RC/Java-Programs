package Singly_Linked_List;

public class Delete_L_node {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+ " --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	public ListNode delete_last() {
		if(head==null) {
			return null;
		}
		else if(head.next==null) {
			ListNode temp=head;
			head=null;
			return temp;
		}
		else {
			ListNode current=head;
			ListNode previous=null;
			while(current.next!=null) {
				previous=current;
				current=current.next;
			}
			previous.next=null;
			return current;
		}
		
	}
	public static void main(String[] args) {
		Delete_L_node sll = new Delete_L_node();
		sll.head= new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		ListNode fifth=new ListNode(50);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		sll.display();
		System.out.println(sll.delete_last().data);
		sll.display();
		System.out.println(sll.delete_last().data);
		sll.display();
		System.out.println(sll.delete_last().data);
		sll.display();
		System.out.println(sll.delete_last().data);
		sll.display();
		System.out.println(sll.delete_last().data);
		sll.display();

	}	

}
