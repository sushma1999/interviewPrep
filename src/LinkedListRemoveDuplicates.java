import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
class LinkedListRemoveDuplicates
{

    public static Node removeDuplicates(Node head) {
        if ((head==null)||(head.next==null))
        {
            return head;
        }
        Node previous=head;
        Node current=head.next;
        while(current!=null){
            if(previous.data==current.data){
                previous.next=current.next;
                current=current.next;
            }else
            {
                previous=current;
                current=current.next;
            }
        }
     return head;
    }

    public static Node insert(Node head, int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}