package ex_08_Switch;

import java.util.Scanner;

public class Lab024_Switch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Enter the number from 1 to 7 for today's program");

        if(scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Mon");
                case 2:
                    System.out.println("Tues");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thurs");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Please enter the valid number from 1 to 7");
            }
        }
        else {
            System.out.println("Invalid int is entered");
        }
            System.out.println("End the Program");
    }
}
