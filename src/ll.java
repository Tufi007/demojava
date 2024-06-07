import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.LinkedList;

public class ll {
    public ListNode head;
    public static class ListNode {
    public int data;
    public ListNode next;
    public  ListNode(int data){
        this.data=data;
        this.next=null;}
    }
    public static void main(String[] args) {
        ll ll1= new ll();
        ll1.head= new ListNode(10);
        ListNode ll2= new ListNode(12);
        ListNode ll3= new ListNode(16);
        ListNode ll4= new ListNode(1288);
        ListNode ll5= new ListNode(1276);
        // System.out.println(ll1.head.next);
        // System.out.println(ll2.next);
        ll1.head.next=ll2;
        ll2.next=ll3;
        ll3.next=ll4;
        ll4.next=ll5;
        ListNode current= ll1.head;
        int count=0;
        while (current != null) {
            count++;
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println("the no of elements are = "+ count);
    }
}
