package Singly_Linked_List;

public class Insert_values_end {
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
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("Null");	
	}
	public void end(int value) {
		ListNode newnode=new ListNode(value);
		if(head==null) {
			head= newnode;
			return;
		}
		ListNode cur=head;
		while(cur.next!=null) {
			cur =cur.next;
		}
		cur.next=newnode;
		display();
	}
	public void specific(int pos,int val) {
		ListNode newnode=new ListNode(val);
		if(pos==1) {
			newnode.next=head;
			head=newnode;
		}
		else {
			ListNode previous=head;
			int count=1;
			while(count<pos-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			newnode.next=current;
			previous.next=newnode;
		}
		display();
	}

	public static void main(String[] args) {
		Insert_values_end sll=new Insert_values_end();
		sll.head= new ListNode(10);
		ListNode second= new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth =new ListNode(40);
		ListNode fifth= new ListNode(50);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		sll.display();
		sll.end(60);
		sll.specific(3, 25);
	}

}
