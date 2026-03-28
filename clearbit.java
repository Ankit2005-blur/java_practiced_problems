import java.util.Scanner;
class clearbit
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   int n=sc.nextInt();
   System.out.println("Enter the positionin which we have to clear the bit");
   int pos=sc.nextInt();
   int bitmask=1<<pos;
   int result=n&(~bitmask);
   System.out.println("Result="+result);
   sc.close();

  }


}