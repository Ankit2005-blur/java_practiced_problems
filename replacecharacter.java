import java.util.Scanner;
class replacecharacter
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
      if(a.charAt(i)=='e')
      {
        b=b+'i';
      }
      else
        {
          b=b+a.charAt(i);

        }
    }

 System.out.println("Result="+b);
 String c=a.replace('i','e');
 System.out.println("using String function="+c);

    sc.close();

  }

}