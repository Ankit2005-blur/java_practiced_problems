import java.util.Scanner;
class substrinng
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String a=sc.next();
    String b="";
    int l=a.length();
   for(int i=0;i<l;i++)
   {
    if(a.charAt(i)=='@')
    {
      break;
    }
    else
    {
        b=b+a.charAt(i);
    }

   }
System.out.println("Result ="+b);

System.out.println("using String function="+a.substring(0,a.indexOf('@')));

    sc.close();


}


}