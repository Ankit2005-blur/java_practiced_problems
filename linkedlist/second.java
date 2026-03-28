package linkedlist;
class node
{
    int val;
    node next;
    node(int val)
    {
     this.val=val;
    }
}

public class second {
    public void display(node head)
    {
      node temp=head;
      while(temp!=null)
      {
        System.out.print(temp.val+"->");
        temp=temp.next;
      }
      System.out.println("NULL");
      
    }
    public static void main(String args[])
    {
       node a=new node(20);
       node b=new node(30);
       node c=new node(40);
       node d=new node(50);
       a.next=b;
       b.next=c;
       c.next=d;
       second ob=new second();
       ob.display(a);

    }
    
}
