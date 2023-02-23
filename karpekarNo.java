import java.util.*;
public class karpekarNo {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int t=a;
     String scr = String.valueOf(a);
     int d=scr.length();
     int k=0;
     System.out.println(d);
     int s=0,r=0;
     s=a*a;
    r=s%(int)Math.pow(10,d);
    s=s/(int)Math.pow(10,d);
    k=s+r;
    if(k==t)
    {System.out.println("it is a kaprekar no"+k);}
    else
    {System.out.println("it is not a kaprekar no"+k);}
    }
    
}
