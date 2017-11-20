package main;
import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter some number for a: ");
        int a = s.nextInt();
        System.out.println("Enter some number for b: ");
        int b = s.nextInt();
        System.out.println("Enter some number for c: ");
        int c = s.nextInt();
        System.out.println("Enter some number for d: ");
        int d = s.nextInt();
        System.out.println("Enter some number for e: ");
        int e = s.nextInt();
        int result=a+b+c+d+e;
        System.out.print("Result summ: " + result);
    }

}
