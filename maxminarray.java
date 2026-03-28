import java.util.Scanner;
class maxminarray
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the number of Elements");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();

    }
    int min=a[0];
    int max=a[0];
    for(int i=0;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
      }
      if(a[i]<min)
      {

        min=a[i];
      }

    }

System.out.println("maximum="+max+" "+"minimum="+min);




    sc.close();
  }

}