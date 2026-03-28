import java.util.Scanner;
class leap
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the year no.");
    int y=sc.nextInt();
    if((y%4==0 && y%100!=0)||(y% 400 == 0))
    System.out.println(y+" leap year");
    else
    System.out.println(y+" not a leap year");
    sc.close();


  }

}