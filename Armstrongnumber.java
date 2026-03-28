import java.util.Scanner;

class Armstrongnumber
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int result=0;
    for(int i=n;i>0;i=i/10)
    {
       int p=i%10;
       result=result+(int) Math.pow(p,3);



    }
    if(result==n)
      System.out.println("Armstrong number");
    else
      System.out.println("Not an Armstrong number");
    sc.close();


  }

}