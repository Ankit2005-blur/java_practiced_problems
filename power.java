import java.util.Scanner;
class power
{
    public  int powe (int n,int p)
    {
       if(n==0)
        return 0;
       
       if(p==0)
        return 1;
        
       int h=n*powe(n,p-1);
       return h;
    }
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        power ob=new power();


      int y= ob.powe (3,5);
      System.out.print("answer="+y);
      sc.close();
    }
}
