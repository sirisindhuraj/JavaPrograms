/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        if(A==null||A.next==null||B==0){
            return A;
        }
        ListNode t=A;
        int l=1;
        while(t.next!=null){
            l++;
            t=t.next;
        }
        t.next=A;
        B=B%l;
        ListNode nt=t;
        int stnh=l-B;
        while(stnh-- >0){
            nt=nt.next;
        }
        ListNode nh=nt.next;
        nt.next=null;
        return nh;
    }
}
