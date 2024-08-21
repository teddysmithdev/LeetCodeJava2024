package org.example;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(0);
        ListNode last = preHead;
        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                last.next = list2;
                list2 = list2.next;
            } else {
                last.next = list1;
                list1 = list1.next;
            }
            last = last.next;
        }
        last.next = list1 == null ? list2 : list1;
        return preHead.next;
    }
}
