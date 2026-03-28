import java.util.*;
class reversearray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int k=sc.nextInt();
        int a[]=new int[k];
        System.out.println("Enter the elements of array");
        for(int i=0;i<k;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<a.length/2;i++)
        {
            int p=a[i];
             a[i]=a[k-1];
             a[k-1]=p;
            k--;
        }
        System.out.println("The reverse array");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}