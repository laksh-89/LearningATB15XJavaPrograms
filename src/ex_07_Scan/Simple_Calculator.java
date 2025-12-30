package ex_07_Scan;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the First Number:" );
        int a = sc.nextInt();

        System.out.println("Enter the Second Number:" );
        int b= sc.nextInt();

        System.out.println("Addition :" + (a+b));
        System.out.println("Substraction :" + (a-b));
        System.out.println("Multiplication :" + (a*b));
        System.out.println("Division :" + (a/b));
        System.out.println("Modulus :" + (a%b));

    }
}
