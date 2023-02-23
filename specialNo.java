import java.util.*;
public class specialNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=a;
        int r,S1=0,s=0,m=0;
        r=a%10;
        a=a/10;
        s=a+r;
        m=a*r;
        S1=s+m;
        if(S1==t)
        {
        System.out.println("the no is special no");
        }
        else{
            System.out.println("the no is not special no"); 
        }
    }
        
    }
    

