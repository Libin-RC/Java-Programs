package Singly_Linked_List;

public class Insert_values_first {

	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public void insert_first(int val) {
		ListNode newNode=new ListNode(val);
		newNode.next=head;
		head=newNode;
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
		Insert_values_first ssl=new Insert_values_first();
		ssl.insert_first(20);
		ssl.insert_first(30);
		ssl.insert_first(40);
		ssl.insert_first(70);
		ssl.display();
	}

}
