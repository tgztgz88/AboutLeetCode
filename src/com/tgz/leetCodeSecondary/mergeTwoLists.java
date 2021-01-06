package com.tgz.leetCodeSecondary;



public class mergeTwoLists {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(4);
        l1.next=l2;
        l2.next=l3;

        ListNode l4=new ListNode(1);
        ListNode l5=new ListNode(3);
        ListNode l6=new ListNode(4);
        l4.next=l5;
        l5.next=l6;
        mergeTwoLists mergeTwoLists=new mergeTwoLists();

        ListNode result=mergeTwoLists.mergeTwoLists(l1,l4);
        while (result!=null){
            System.out.print(result.val+"---");
            result=result.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode result=new ListNode();
        ListNode now=result;
        while (l1!=null||l2!=null){
            if (l1==null){now.next=l2;return result.next;}
            else if (l2==null){now.next=l1;return result.next;}
            if(l1.val>l2.val){
             ListNode nowresult=new ListNode(l2.val);
                now.next = nowresult;
                l2=l2.next;
                now=now.next;
            }else {
                ListNode nowresult = new ListNode(l1.val);
                now.next = nowresult;
                l1=l1.next;
                now=now.next;
            }
        }
        return null;
    }
}
