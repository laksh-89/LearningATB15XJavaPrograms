package EighteenJan_Java_coding_test;

import java.util.Scanner;

public class Check_string_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.nextLine();

       /* if (input.length() > 10) {
            System.out.println("String length is greater than 10");
        } else {
            System.out.println("String length is not greater than 10");
        }*/
        System.out.println(input.length() >10 ? "String length is greater than 10" : "String length is not greater than 10");
    }
}
