/**
 * Created by yamahachou on 2019/3/12.
 */
public class Add_Two_Numbers {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int extra = 0;
        while (l1 != null || l2 != null) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int val = l1Val + l2Val + extra;
            int record = val >= 10 ? val % 10 : val;
            head.next = new ListNode(record);
            head = head.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            extra = val / 10;
        }
        if(extra == 1){
            head.next = new ListNode(1);
        }
        return dummy.next;
    }





//        ListNode start = new ListNode(0);
//        ListNode dump = start;
//        int extra = 0;
//        while(l1 != null && l2 != null){
//            int val = l1.val + l2.val + extra;
//            int record = val >=10 ? val % 10 : val;
//            dump.next = new ListNode(record);
//            dump = dump.next;
//            l1 = l1.next;
//            l2 = l2.next;
//            extra = val/10;
//        }
//
//        if(l1 != null && l2==null){
//            if(extra == 0){
//                dump.next = l1;
//            }else{
//                while (extra == 1 && l1 != null){
//                    int val = l1.val + extra;
//                    int record = val >=10 ? val % 10 : val;
//                    dump.next = new ListNode(record);
//                    dump = dump.next;
//                    l1 = l1.next;
//                    extra = val/10;
//                }
//            }
//        }
//        if(l2 != null && l2 ==null){
//            if(extra == 0){
//                dump.next = l2;
//            }else{
//                while (extra == 1 && l2 != null){
//                    int val = l2.val + extra;
//                    int record = val >=10 ? val % 10 : val;
//                    dump.next = new ListNode(record);
//                    dump = dump.next;
//                    l2 = l2.next;
//                    extra = val/10;
//                }
//            }
 //       }
//        if(l1 ==null && l2 == null){
//            if(extra == 1){
//                dump.next = new ListNode(extra);
//            }
//        }
//
//        return start.next;
 //   }

    public static void main(String[] avgs){
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
//        l1.next = new ListNode(3);
        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);

        ListNode start = addTwoNumbers(l1,l2);
        while (start!=null){
            System.out.print(start.val + " -> ");
            start = start.next;
        }
    }
}
