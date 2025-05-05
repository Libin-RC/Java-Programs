package Singly_Linked_List;

public class Delete_F_node {
	
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
	public ListNode del_first() {
		if(head==null) {
			return null;
		}
		else {
			ListNode temp=head;
			head=head.next;
			temp.next=null;
			return temp;
		}
		
	}
	public static void main(String[] args) {
		Delete_F_node sll = new Delete_F_node();
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
		System.out.println("Deleted value: "+sll.del_first().data);
		sll.display();
		System.out.println("Deleted value: "+sll.del_first().data);
		sll.display();
		System.out.println("Deleted value: "+sll.del_first().data);
		sll.display();
		System.out.println("Deleted value: "+sll.del_first().data);
		sll.display();
		System.out.println("Deleted value: "+sll.del_first().data);
		sll.display();

	}

}
