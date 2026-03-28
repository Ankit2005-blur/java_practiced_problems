import java.util.Scanner;
class selectionsort
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of araay");
  int n=sc.nextInt();
  int a []=new int [n];
  System.out.println("Enter the elements of array");
  for(int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();

  }
  
  for(int i=0;i<n;i++)
  {
    int smallest=i;

    for(int j=i+1;j<n;j++)
    {
      if(a[j]<a[smallest])
      {
        smallest=j;
      }
      int temp=a[i];
     a[i]=a[smallest];
     a[smallest]=temp;
    }

  }
  System.out.println("Sorted array");
  for(int i=0;i<n;i++)
  {
   System.out.print(a[i]+" "); 

  }

    sc.close();

  }


}