package algo.leetcode.easy;

import data.dto.ListNode;

public class __10_141_Linked_List_Cycle {
	public static boolean hasCycle(ListNode head) {

		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n2;

		boolean hasCycle = hasCycle(n1);
	}
}
