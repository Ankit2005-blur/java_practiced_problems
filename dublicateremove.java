import java.util.*;
class dublicateremove
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
         a[i]=sc.nextInt();
        }
        System.out.println("the original array is ");
        for(int i=0;i<n;i++)
        {
        System.out.print(a[i]+" ");
        }
        System.out.println();
        Arrays.sort(a);
        int i=0;
        for(int j=1;j<n;j++)
        {
           if(a[i]!=a[j])
           {
            i++;
            a[i]=a[j];
           }
        }
        System.out.println("the required array is");
        for(int k=0;k<=i;k++)
        {
            System.out.print(a[k]+" ");
        }
        
     sc.close();
    }
}