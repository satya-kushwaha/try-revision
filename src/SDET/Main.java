package SDET;
// Software Development Engineer in Test
import java.util.Scanner;

public class Main {

    // Fibonacci 0 1 1 2 3 5 8 13 ...
    public  void Fibonacci(int d){
        int a =0,b=1,c;
        for (int i = 0; i<=d; i++){
            System.out.print(+a+"\t");
            c=a+b;
            a=b;
            b=c;
        }
    }
    //Swap two number witout using theird vearble
    public  void swap(int x , int y){
        System.out.println("Before x and y Value = "+x +"\t" +y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("\"After x and y Value = "+ x +"\t" +y);
    }

    //fectorial   5=1*2*3*4*5*=120;
    public  void  fectorial(int a){
        int n=1;
        for (int i =a;i>=1;i--){
            n=n*i;
        }
        System.out.println("Factorial of a "+n);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number!");
        Scanner num = new Scanner(System.in);
        int numb = num.nextInt();
        int numb1 = num.nextInt();
//        int numbe = num.nextInt();
        Main m = new Main();
//        m.Fibonacci(numb);
//        m.swap(numb,numbe);
//        m.fectorial(numb);

    }
}