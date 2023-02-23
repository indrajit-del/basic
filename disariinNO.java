import java.util.*;
public class disariinNO {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=a;
        String str = String.valueOf(a);
        int d=str.length();
        int i,r=0,s=0;
        for(i=d;i>=1;i--)
        {
            r=a%10;
            s=s+(int)Math.pow(r,d);
          
            a=a/10;
            d--;
        }
        if(s==t)
       {System.out.println("the number is disariin");}
       else
       {System.out.println("the number is not disariin");}
    }
    
}
