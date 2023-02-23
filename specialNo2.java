import java.util.*;
public class specialNo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
        int t=a;
        int r,s=0,m=0;
        while(a>0)
        {r=a%10; 
        int fact = 1;
        for (int i = 1; i <= r; ++i) 
        {
            fact *= i;
        }
        s=s+fact;
        a=a/10;
    }
    if(s==t)
    {
    System.out.println("the no is special no");
    }
    else
    {
    System.out.println("the no is  not special no");
    }
}
}