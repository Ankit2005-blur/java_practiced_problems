package linkedlist;
 class node
{
  int data;
  node next;
  }
public class basic
{
  public static void main(String args[])
  {
  node a=new node();
  a.data=10;
  node b=new node();
  b.data=20;
  node c=new node();
  c.data=30;
  node d=new node();
  d.data=40;
  System.out.println(d.data);
  // linking
  a.next=b;
  b.next=c;
  c.next=d;
  System.out.println(c);
  System.out.println(b.next);
  }
}
