import java.util.Scanner;
class largestsubstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String a=sc.nextLine();
        int k=3;
        int l=a.length();
        String small=a.substring(0,k);
        String big=a.substring(0,k);
        for(int i=0;i<l-k;i++)
        {
            String p=a.substring(i,i+3);
            if(p.compareTo(small)<0)
                small=p;
            if(p.compareTo(big)>0)
                big=p;
        }
        System.out.println("Small string="+small);
        System.out.println("big string="+big);

      sc.close();

    }
}