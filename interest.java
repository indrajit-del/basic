import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class interest {
    double p,t,r,a;
    double i;
    void getdata(){
        
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        t=sc.nextInt();
    }
    void calculateData(){
         r=5;
        i=p*(Math.pow((1 + r / 100), t));
        a=p+i;
        
    }
    void showData(){
        System.out.println("the interest is"+i);
        System.out.println("the amout with interest  is"+a);
    }
    public static void main(String[] args) {
        interest ob=new interest();
        ob.getdata();
        ob.calculateData();
        ob.showData();
    }
}
