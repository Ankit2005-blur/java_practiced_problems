import java.util.Scanner;
class transposematrix
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no. of rows and columns");
  int r=sc.nextInt();
  int c=sc.nextInt();
  System.out.println("Enter the elements ");
  int a[][]=new int[r][c];
  for(int i=0;i<r;i++)
  {
     for(int j=0;j<c;j++)
     {
        a[i][j]=sc.nextInt();

     }

  }
  System.out.println("the maitrix is");
  for(int i=0;i<r;i++)
  {
     for(int j=0;j<c;j++)
     {
       System.out.print(a[i][j]+"  ");
     }
 System.out.println();

  }
  int b[][]=new int[c][r];

  System.out.println("the transpose matrix is:-");
   for(int i=0;i<c;i++)
   {
    for(int j=0;j<r;j++)
    {
      b[i][j]=a[j][i];   
     }
    }
for(int i=0;i<c;i++)
  {
     for(int j=0;j<r;j++)
     {
       System.out.print(b[i][j]+"  ");
     }
 System.out.println();

  }



  sc.close();
}
}