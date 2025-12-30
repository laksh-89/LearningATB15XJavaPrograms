package ex_07_Scan;

import java.util.Scanner;

public class Employee_details {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Name :");
        String a= sc.nextLine();

        System.out.println("Enter Age");
        int b= sc.nextInt();

        System.out.println("Enter Salary");
        double c= sc.nextDouble();

        System.out.println("\nEmployee Details");
        System.out.println("Name :" + a);
        System.out.println("Age :" + b);
        System.out.println("Salary :" +c);
    }
}
