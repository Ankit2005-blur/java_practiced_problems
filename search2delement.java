import java.util.Scanner;
class search2delement
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. of rows and columns");
    int r=sc.nextInt();
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    System.out.println("Enter the matrix element:");
    for(int i=0;i<r;i++)
    {

        for(int j=0;j<c;j++)
        {

            a[i][j]=sc.nextInt();
        }

    }
    System.out.println("the matrix elements are");
    for(int i=0;i<r;i++)
    {

        for(int j=0;j<c;j++)
        {

            System.out.print(a[i][j]+"  ");

        }
        System.out.println();
    }
    System.out.println("Enter the element to be found");
    int b=sc.nextInt();
    int fr=-1;
    int fc=-1;
    for(int i=0;i<r;i++)
    {

        for(int j=0;j<c;j++)
        {

            if(a[i][j]==b)
            {
                fr=i+1;
                fc=j+1;
                System.out.println("element found in row="+fr+" "+"column="+fc);
            }
        }

    }
    if(fr==-1&& fc==-1)
    {

     System.out.println("Element not found");
    }
    




    sc.close();


 }


}