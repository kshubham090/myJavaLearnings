// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// import java.util.*;
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if(head==null || head.next == null){
//             return head;
//         }
//         ListNode newhead = reverseList(head.next);
//         ListNode front = head.next;
//         front.next=head;
//         head.next = null;
//         return newhead;
//         // ListNode temp = head;
//         // ListNode prev = null;
//         // while(temp!=null){
//         //     ListNode front = temp.next;
//         //     temp.next = prev;
//         //     prev = temp;
//         //     temp = front;
//         // }

//         // return prev;
        
//     }
// }
// // https://leetcode.com/problems/reverse-linked-list/description/
