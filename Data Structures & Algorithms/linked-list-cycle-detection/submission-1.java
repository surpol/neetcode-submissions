/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        // iterate and store values of nodes. if value exists/ its a cycle 
        // track value and index

        ListNode cur = head;
        HashSet<ListNode> map = new HashSet<>();
        while (cur != null) {
            if (map.contains(cur)) {
                return true;
            }
            map.add(cur);
            cur = cur.next;
        }

        return false;
    }
}
