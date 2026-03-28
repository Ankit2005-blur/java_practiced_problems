import java.util.Scanner;
class setbit
{
    public static void main (String args[])
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      System.out.println("Enter the position in which bit has to be set");
      int pos=sc.nextInt();
      int bitmask=1<<pos;
      int result=n|bitmask;
      System.out.println("After Setting the bit the new number is = "+result);

      sc.close();

    }


}