import java.util.Scanner;
class reverse
{
  public static void main (String ars[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a no.");
     int n=sc.nextInt();
     int r = 0;
     for(int i=n;i>0;i=i/10)
     {
       int p=i%10;
       r=r*10+p;

     }
     System.out.println("Reverse no.="+ r);

     sc.close();

  }

}