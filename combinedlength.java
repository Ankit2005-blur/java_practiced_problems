import java.util.Scanner;
class combinedlength
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of names");
    int n=sc.nextInt();
    String a[]= new String[n];
    for(int i=0;i<n;i++)
    {

        a[i]=sc.next(); 
    }
    int l=0;
    for(int i=0;i<n;i++)
    {

System.out.print(a[i]+"  ");  

   l=l+a[i].length();
  }
  System.out.println();
  System.out.println("Combined length="+l);

    sc.close();


  }



}