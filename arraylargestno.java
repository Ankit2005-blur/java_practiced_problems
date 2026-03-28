    import java.util.Scanner;
    class arraylargestno
    {
        public static void main(String args[])
        {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a number of elements of array");
           int r=sc.nextInt();
           int a[]=new int[r];
           
           System.out.println("Enter the array Elements");
           for(int i=0;i<r;i++)
            {
              a[i]=sc.nextInt();
            }
            int largest=a[0];
           int p=0;
           for(int i=0;i<r;i++)
           {
             if(a[i]>largest)
             {
                largest=a[i];
                p=i;
             }
           }
           System.out.println("largest no="+largest+" found in index="+p);




           sc.close();


        }
    }
