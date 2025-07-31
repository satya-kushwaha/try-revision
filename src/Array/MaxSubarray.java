package Array;

import java.util.Scanner;

public class MaxSubarray {


    public  static  void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number how much long array ");
        int n = scanner.nextInt();
        System.out.println("Enter a array ");
        int[] arr = new int[n];
        for(int a=0;a<n;a++){
            arr[a]=scanner.nextInt();
        }

    }
}
