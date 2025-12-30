package ex_07_Scan;

import java.util.Scanner;

public class Adding_two_Num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the First Number:" );
        int a = sc.nextInt();

        System.out.println("Enter the Second Number:" );
        int b= sc.nextInt();

        System.out.println("Sum=" + (a+b));
    }
}
