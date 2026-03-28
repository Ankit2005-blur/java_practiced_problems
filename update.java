import java.util.Scanner;
class update
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      System.out.println("Enter the position in which bit has to update");
      int pos=sc.nextInt();
      System.out.println("Enter the value to update");
      int bitmask=1<<pos;
      int v=sc.nextInt();
      int result;
      if(v==0)
      {
        result=n&(~bitmask);
        System.out.println("Result = "+result);
      }
      else if(v==1)
      {
        result=n|bitmask;
        System.out.println("Result = "+result);     
     }
     else
     {
        System.out.println("invalid Update value");

     }
       sc.close();
    }
}