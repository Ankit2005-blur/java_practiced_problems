import java.util.Scanner;
class nameklist
{
    public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number name");
   int n=sc.nextInt();
   String name[]=new String[n];
   System.out.println("Enter the names ");
   for(int i=0;i<n;i++)
   {
      name[i]=sc.next();
   }

   for(int i=0;i<n;i++)
   {
    System.out.print(name[i]+"      ");

   }




sc.close();

 }


}