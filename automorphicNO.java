import java.util.*;
public class automorphicNO {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         int i,s=0,t=a;
         int n,r,auto=0,d=0;
         s=a*a;
         while(a>0)
         {
            n=a%10;
            d++;
            a=a/10;
         }
        r=s%(int)Math.pow(10,d);
        if(r==t)
        {
            System.out.println("the no is automorphic:"); 
        }
        else
        {
            System.out.println("the no is  not automorphic:");
        }
    }
}