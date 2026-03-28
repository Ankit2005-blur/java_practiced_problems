import java.util.Scanner;
class palindromestring
{

   public String palindrome(String b)
   {
    String c="";
    int p=b.length();
    
    for(int i=p-1;i>=0;i--)
    {
        
     
       c=c+b.charAt(i);

    }
   return c;
   }
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a String");
 String a=sc.nextLine();
 palindromestring ob=new palindromestring();

String  y= ob.palindrome(a);
System.out.println("reverse String="+y);
if(a.equalsIgnoreCase(y))
    System.out.println("Palindrome String");
else
    System.out.println("Not a Palindrome String");



  

 sc.close();

}

}