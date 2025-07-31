package Array;

import java.util.Scanner;

public class ReversArray {

    void reverseArray(int arr[], int sz){
        int start=0,end=sz-1;
        while (start < end){
            int a=arr[start];
            arr[start]=arr[end];
            arr[end]=a;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a size array");
        int n= scanner.nextInt();
        System.out.println("Enter a array");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        ReversArray r= new ReversArray();
       r.reverseArray(arr,n);
        System.out.println("Showing reverse Array");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
