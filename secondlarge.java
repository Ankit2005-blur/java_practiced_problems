import java.util.*;
class secondlarge
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements of array");
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        int largest=0;
        int second=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>largest)
            {
                second=largest;
                largest=a[i];
                
            }
            else if(a[i]>second && a[i]<largest )
            {
                second =a[i];
            }

        }
        System.out.println("second Largest element="+second);

        sc.close();
    }
}