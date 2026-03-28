import java.util.Scanner;
class getbit
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
    System.out.println("Enter the position of  where you want the bit");
    int pos=sc.nextInt();
    int bitmask=1<<pos;
    if((n & bitmask)==0)
    {
        System.out.println(0);
    }
    else
    {
        System.out.println(1);
    }


      sc.close();

    }


}