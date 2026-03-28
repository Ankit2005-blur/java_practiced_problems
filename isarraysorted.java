import java.util.Scanner;
class isarraysorted
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int s=sc.nextInt();
int a[]=new int[s];
 System.out.println("Enter the Elements of array");
 for(int i=0;i<s;i++)
 {
   a[i]=sc.nextInt();

 }
 int min=a[0];
 int y=1;
 for(int i=1;i<a.length;i++)
{
if(a[i]<min)
{
  y=0;
  break;
}

}
if(y==1)
{
  System.out.println("the array is sorted");
}
else
{
  System.out.println("the array is not sorted");
}


  sc.close();




}
}