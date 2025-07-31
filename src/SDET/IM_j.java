package SDET;

import java.util.Scanner;

public class IM_j {
    //Armstrong number 153  = 1^3 * 5^3 * 3^3= 153
    public void Armstrong(int a){
        int x=0,b=a,c=0,z;
       while (a>0){
         z=a%10;
         a=a/10;
         x++;
         c=c+z*z*z;
       }
        if(b == c){
            System.out.println("It is Armstrong number"+c);
        }else{
            System.out.println("It is not Armstrong number "+c);
        }
    }
    // Number of digit
    public  void number(int a ){
        int x=0;
        while (a>0){
            a = a/10;
            x++;
        }
        System.out.println("Total given number of : "+x);
    }
    //Reverse number  a = 12345, a=4321 // not solve
  public   void revarNumber(int x){
        int r,rn=0,rx;
        while (x>0){
            r=x%10;
            rn=rn*10+r;
            x=x/10;
        }
        System.out.println("The revese number of "+rn);
    }
    public  void sumOfDigit(int x ){
        int r=0,a;
        while(x>0){
            a=x%10;
            r=r+a;
            x=x/10;
        }
        System.out.println("The sum of digit "+r);
    }

    public static  void main(String[] args){
        System.out.println("Enter Armstrong number");
        Scanner a = new Scanner(System.in);
        int arm = a.nextInt();
        IM_j i = new IM_j();
//        i.Armstrong(arm);
//        i.number(arm);
        i.revarNumber(arm);
//        i.ram();
//        i.sumOfDigit(arm);
    }
}
