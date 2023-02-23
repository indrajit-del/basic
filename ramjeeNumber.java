import java.util.*;
class ramjeeNumber {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int s=0,i,j,k;
       for(i=a;i>9;i=s)
       {
         s=0;
         for(j=i;j>0;j=j/10)
         {
             k=j%10;
             s=s+(k*k);
         }
       }
       if(s==1)
      { System.out.println("\n this is ramjee no,");
      }
      else
      {
         System.out.println("\n this not ramjee");
      }

   }
}