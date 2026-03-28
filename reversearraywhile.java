import java.util.Scanner;
class reversearraywhile
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int k=0;k<n;k++)
        {
            a[k]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        System.out.println("the original array");
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println("The reverse array is ");
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
        sc.close();
    }
}