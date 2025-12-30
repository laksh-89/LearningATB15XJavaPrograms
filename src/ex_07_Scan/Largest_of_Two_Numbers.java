package ex_07_Scan;

import java.util.Scanner;

public class Largest_of_Two_Numbers {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number:" );
        int a= sc.nextInt();

        System.out.println("Enter the Second Number:" );
        int b= sc.nextInt();

        if (a>b) {

            System.out.println("First number is Greater");
        } else {
            System.out.println("Second Number is Greater");
        }
    }
}
