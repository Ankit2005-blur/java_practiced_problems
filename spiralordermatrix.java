import java.util.Scanner;
class spiralordermatrix
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

  System.out.println("the spiral order of matrix is");
  int rowstart=0;
  int rowend=r-1;
  int colstart=0;
  int colend=c-1;
  while(colstart<=colend && rowstart<=rowend)
  {
  for(int col=colstart;col<=colend;col++)
  {
     System.out.print(a[rowstart][col]+" ");

 }
 rowstart++;

  for(int row=rowstart;row<=rowend;row++)
  {
     System.out.print(a[row][colend]+" ");

     }
     colend--;
     if(rowstart<=rowend){
for(int col=colend;col>=colstart;col--)
  {
     System.out.print(a[rowend][col]+" ");

     }
     rowend--;
   }
   if(colstart<=colend){
     for(int row=rowend;row>=rowstart;row--)
  {
     System.out.print(a[row][colstart]+" ");

     }
     colstart++;
   }
   }
     
  /*    for(int col=colstart;col<=colend;col++)
  {
     System.out.print(a[rowend][col]);
  } */

     

    sc.close();
}

}