import org.junit.Test;
import static org.junit.Assert.assertEquals;
/*
Linked List Cycle

Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again 
by continuously following the next pointer. 
Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.
*/

public class $141{
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static boolean hasCycle(ListNode head) {
        ListNode aux = head.next;
        while(aux != null){
            aux.val = 10000;
            if(aux.next.val == 10000){
                return true;
            }
            aux = aux.next;
        }
        return false;
    }
    @Test
    public void testHasCycle(){
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;
        assertEquals(true,$141.hasCycle(node1));
    }
    @Test
    public void testHasCycle2(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1;
        assertEquals(true,$141.hasCycle(node1));
    }
    @Test
    public void testHasCycle3(){
        ListNode node1 = new ListNode(3);
        assertEquals(false,$141.hasCycle(node1));
    }
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("$141");
    }
}