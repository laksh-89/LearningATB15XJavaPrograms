package ex_22_Exception;

import java.util.Scanner;

public class Handle_exception {

    public static void main(String[] args) {

        System.out.println("Program is Started...");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        try
        {
            System.out.println(100/num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Invalid Data...");

        }
        System.out.println("Program is completed..");
        System.out.println("program is exited...");
    }
}
