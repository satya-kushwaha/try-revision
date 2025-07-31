package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a String ");
        String name = s.nextLine();
        System.out.println("tream "+name.trim());
        System.out.println("Lower Case "+name.toLowerCase());
        System.out.println("UpperCase "+name.toUpperCase());
        System.out.println("Length "+name.length());
        System.out.println("a to b repalce "+name.replace('a','b'));
        System.out.println("subarray "+name.substring(3));
        System.out.println("subarray "+name.substring(3,6));
        System.out.println("startsWith ra "+name.startsWith("ra"));
        System.out.println("endsWith "+name.endsWith("ra"));


    }
}
