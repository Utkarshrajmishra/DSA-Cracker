
class Solution {
    public void deleteNode(ListNode node) {
       ListNode cur=node;
node.val=cur.next.val;
node.next=node.next.next;
    }
}
