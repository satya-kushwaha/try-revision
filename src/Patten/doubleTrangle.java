package Patten;

import java.util.Scanner;

public class doubleTrangle {
    public void st(int x){
        for(int i=1,p=5;i<=x;i++,p--){
            System.out.println();
            for(int j=1;j<=i;j++){
                System.out.print(p+"\t");
            }
        }
    }
    public void evendt(int x){
        for(int i=1,p=0;i<=x;i++,p+=2){
            System.out.println();
            for(int j=1;j<=i;j++){
                System.out.print(p+"\t");
            }
        }
    }
    public void dt(int hight){
        for(int n=1; n<=hight; n++){
            System.out.println();
            for(int j=n;j<=hight;j++) {
                System.out.print(" ");
            }for(int j=1;j<n;j++) {
                System.out.print("*");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
        }
    }
    public void heshdt$(int x){
        char a = '#';
        for(int i=1;i<=x;i++){
            System.out.println();
            for(int j=1;j<=i;j++){
                if(a == '#'){
                    System.out.print(a+"\t");
                }else{
                    System.out.print(a+"\t");
                }
            }
            if(a == '#'){
                a='$';
            }else{
                a='#';
            }
        }
    }
    //not solve
    public void domainpatten(int hight){
        for(int n=1,p=1; n<=hight; n++,p++){
            System.out.println();
            for(int j=n;j<=hight;j++) {
                System.out.print(" ");
            }for(int j=1;j<n;j++) {
                System.out.print("* ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
        }
        for(int n=1,p=1; n<=hight; n++,p++){
            System.out.println();
            for(int j=n;j<=hight;j++) {
                System.out.print(" ");
            }for(int j=1; j>n; j++){
                System.out.print("* ");
            }
            for(int j=1;j>=n;j++) {
                System.out.print("* ");
            }
        }
    }

    //not solve
    public void londtraingled(int x) {
        int v=x;
        int space = 8,star=0;
        for(int n=0; n<4; n++){
            star++;
            space-=2;
            System.out.println();
            for(int j=0;j<star;j++) {
                System.out.print("*");
            }for(int j=0;j<space;j++) {
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
        }
    }
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for trangle");
        int x = scanner.nextInt();
        doubleTrangle d = new doubleTrangle();
//        d.st(x);
//        d.dt(x);
//        d.evendt(x);
//          d.heshdt$(x);
//          d.domainpatten(x);
    }
}
