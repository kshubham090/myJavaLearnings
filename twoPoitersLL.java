// public class twoPoitersLL {
//     public ListNode middleNode(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;

//         // Move fast pointer twice as fast as the slow pointer
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // When fast reaches the end, slow is at the middle
//         return slow;
//     }
// }
// https://leetcode.com/problems/middle-of-the-linked-list/