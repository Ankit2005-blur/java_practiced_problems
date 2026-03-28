import java.util.Scanner;
class characterscount
{
    void count(String a)
    {
      int v=0;
      int c=0;
      int s=0;
      int sp=0;
      int l=a.length();
       String h=a.toLowerCase();
     for(int i=0;i<l;i++)
     {
        char y=h.charAt(i);
        if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
        {
          v++;
        }
        else if(Character.isWhitespace(y))
        {
           s++;
        }
        else if((int)y >= 97 && (int)y<=122)
        {
          c++;
        }
        else 
        {
         sp++;
        }


     }
     System.out.println("consonants="+c+" "+"vowels="+v+" "+"whitespaces="+s+" "+"special characters="+sp);

    }



 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
characterscount ob=new  characterscount();
System.out.println("Enter a String");
String g=sc.nextLine();
ob.count(g);

   sc.close();

 }


}