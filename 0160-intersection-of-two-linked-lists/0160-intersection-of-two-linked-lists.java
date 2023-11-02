/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int lenA = 0;
        int lenB = 0;

        while(tempA != null){
            lenA++;
            tempA = tempA.next;
        }
        tempA = headA;

        while(tempB != null){
            lenB++;
            tempB = tempB.next;
        }
        tempB = headB;
        if(lenA > lenB){
            int step = lenA - lenB;
            for(int i = 1; i <= step; i++){
                tempA = tempA.next;
            }
        }else{
            int step = lenB - lenA;
            for(int i = 1; i <= step; i++){
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}