import java.util.Scanner;
class anagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String");
        String a=sc.nextLine();
        System.out.println("Enter the second String");
        String b=sc.nextLine();
        String A=a.toLowerCase();
        String B=b.toLowerCase();
        boolean result=true;
        if(A.length()!=B.length())
        {
            result=false;
        }
        int c[]=new int[26];

        for(int i=0;i<A.length();i++)
        {
            c[A.charAt(i)-'a']++;
        }
        for(int i=0;i<B.length();i++)
        {
            c[B.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(c[i]!=0)
               result=false;
        }
         
         if(result==true)
            System.out.println("ANAGRAM");
        else
            System.out.println("NOT A ANAGRAM");

       sc.close();
    }
}