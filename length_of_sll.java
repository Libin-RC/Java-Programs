package Singly_Linked_List;

public class length_of_sll {
	
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	int count=0;
	public int length(){
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
			count++;
		}
		System.out.println("null");
		return count;
		
	}

	public static void main(String[] args) {
		length_of_sll sll=new length_of_sll();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		int l=sll.length();
		System.out.println(l);
	}

}
