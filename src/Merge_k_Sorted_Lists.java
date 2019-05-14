/**
 * Created by yamahachou on 2019/3/12.
 */
public class Merge_k_Sorted_Lists{

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2 !=null){
            if(l1.val < l2.val){
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }else{
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if(l1 != null){
            cur.next = l1;
        }
        if(l2 != null){
            cur.next = l2;
        }
        return dummyHead.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        while(n > 1){
            int k = (n + 1) / 2;
            for(int i = 0 ; i < n / 2; i++){
                lists[i] = merge2Lists(lists[i], lists[i + k]);
            }
            n = k;
        }

        return lists[0];

//        List<Integer> list = new ArrayList<>();
//        for(int i = 0 ; i < lists.length; i++){
//            ListNode curNod = lists[i];
//            while (curNod != null){
//                list.add(curNod.val);
//                curNod = curNod.next;
//            }
//        }
//        Collections.sort(list);
//        ListNode head = new ListNode(0);
//        ListNode point = head;
//        for(int i = 0 ; i < list.size(); i++){
//            point.next = new ListNode(list.get(i));
//            point = point.next;
//        }
//        return head.next;

    }

    public static void main(String[] avgs){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = new ListNode[] {l1, l2, l3};
        ListNode arr = mergeKLists(lists);
        while (arr != null){
            System.out.print(arr.val);
            if(arr.next == null){
                break;
            }
            System.out.print(" -> ");
            arr = arr.next;
        }

    }
}
