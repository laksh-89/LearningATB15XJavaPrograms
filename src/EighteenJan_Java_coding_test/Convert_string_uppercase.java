package EighteenJan_Java_coding_test;

import java.util.Scanner;

public class Convert_string_uppercase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input= sc.nextLine();

        String result= input.toUpperCase();
        System.out.println("Uppercase string " +result);
    }
}
