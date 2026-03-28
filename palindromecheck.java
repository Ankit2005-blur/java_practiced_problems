import java.util.*;
public class palindromecheck 
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=sc.nextInt();
     int r=0;
     for(int i=n;i>0;i=i/10)
     {
               int p=i%10;
             r=r*10+p;


     }
     if(r==n)
        System.out .println("Palindrome no.");
    else
      System.out.println("not a palindrome no");


     sc.close();


   }
    
}