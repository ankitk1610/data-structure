package linkedlist;

public class SortAlreadySortedListOnAbsValue {

	public static ListNode sortList(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode current = head.getNext();
		ListNode prev = head;

		while (current != null) {
			if ( current.getData() < prev.getData()) {
				prev.setNext(current.getNext());
				current.setNext(head);
				head = current;
				current  = prev;
			}
			else {
				prev = current;
				current = current.getNext();
			}
		
		}

		return head;

	}

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.next = new ListNode(-1);
		head.next.next = new ListNode(-2);
		head.next.next.next = new ListNode(-3);
		head.next.next.next.next = new ListNode(-4);
		head.next.next.next.next.next = new ListNode(-5);
		head.next.next.next.next.next.next = new ListNode(-5);
		head.next.next.next.next.next.next.next = new ListNode(-9);
		head = sortList(head);
		while (head != null) {
			System.out.print(head.getData() + " ");
			head = head.getNext();
		}

	}
}
