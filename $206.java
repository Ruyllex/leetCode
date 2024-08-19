import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
/*
Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.
*/
class $206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }   
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    @Test
    public void testReverseList(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        
        ListNode reversedHead = reverseList(node1);
        assertEquals(5, reversedHead.val);
        assertEquals(4, reversedHead.next.val);
        assertEquals(3, reversedHead.next.next.val);
        assertEquals(2, reversedHead.next.next.next.val);
        assertEquals(1, reversedHead.next.next.next.next.val);
        assertNull(reversedHead.next.next.next.next.next); 
    }
}