/**
 * Created by yamahachou on 2018/11/26.
 */
public class Remove_Duplicates_from_Sorted_List {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode cur = head;
        while(cur != null && cur.next != null ){
            if(cur.next.val == cur.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        ListNode cur  = deleteDuplicates(head);
        while (cur!=null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
