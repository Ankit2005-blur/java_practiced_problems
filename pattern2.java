class pattern2
{
public static void main (String args[])
{
  int n=5;
  for (int i=n;i>=1;i--)
  {
   for(int j=1;j<i;j++)
   {
    System.out.print(" ");

   }

   char ch=' ';
   if(i==1||i==2)
    ch='&';
else if(i==3||i==4)
    ch='#';
else if(i==5)
    ch='*';

   for(int j=0;j<=n-i;j++)
   {
      System.out.print(ch);
   }
   System.out.println();
     
  }

}


}
