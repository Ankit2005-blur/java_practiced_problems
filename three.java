import java.util.Scanner;
class largestno
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter three nos.");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>=b&&a>=c)
        System.out.println("a is largest");
    else if(b>=c&&b>=c)
        System.out.println("b is the largest");
     else 
        System.out.println("c is the largest");


    sc.close();

  }

}