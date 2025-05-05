package Singly_Linked_List;

public class Create_and_print_SLL {
	
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		private ListNode(int data) {
			this.data=data;
			this.next=null;
			}
	}
	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		Create_and_print_SLL sll=new Create_and_print_SLL();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		sll.display();
	}

}
