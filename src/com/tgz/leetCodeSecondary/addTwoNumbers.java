package com.tgz.leetCodeSecondary;

public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(4);
        ListNode l3=new ListNode(3);
        l1.next=l2;
        l2.next=l3;

        ListNode l4=new ListNode(5);
        ListNode l5=new ListNode(6);
        ListNode l6=new ListNode(4);
        l4.next=l5;
        l5.next=l6;
         addTwoNumbers addTwoNumbers=new addTwoNumbers();
        ListNode result=addTwoNumbers.addTwoNumbers(l1,l4);
        while (result!=null){
            System.out.print(result.val+"---");
            result=result.next;
        }
    }

   public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode result=new ListNode();
        ListNode now=result;
        int c=0;
        while (l1!=null||l2!=null||c==1){
            int a=0;
            int b=0;
            if(l1!=null){a=l1.val;}
            if (l2!=null){b=l2.val;}
            int x=(a+b+c)%10;
            ListNode nowresult=new ListNode(x);
            now.next=nowresult;
            if(a+b+c>9){c=1;}else {c=0;}
            if(l1!=null){l1=l1.next;}
            if (l2!=null){l2=l2.next;}
            now=now.next;
         }
        return result.next;
   }
}
