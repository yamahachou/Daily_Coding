/**
 * Created by yamahachou on 2019/3/12.
 */
public class Intersection_of_two_linked_list {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static int getLength(ListNode head){
        int count = 0;
        while (head!=null){
            head = head.next;
            count++;
        }
        return count;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int aLength = getLength(headA);
        int bLength = getLength(headB);

        if(aLength > bLength){
            int diff = aLength - bLength;
            while (diff > 0){
                headA = headA.next;
                diff--;
            }
        }
        if(bLength > aLength){
            int diff = bLength - aLength;
            while (diff > 0){
                headB = headB.next;
                diff--;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;





    }

    public static void main(String[] avgs){
        ListNode l1 = new ListNode(10);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(8);
        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(5);
        ListNode inter = new ListNode(3);
        inter.next = new ListNode(2);
        inter.next.next = new ListNode(1);
        l1.next.next.next = inter;
        l2.next.next = inter;
        ListNode res = getIntersectionNode(l1,l2);
        System.out.println(res.val);



    }
}
