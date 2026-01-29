package ex_12_String;

import java.util.Scanner;

public class Lab060_String_Palindrome {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the String!");
        String user_input = scanner.next();

        String reverse_string = "";

        for (int i=user_input.length()-1;i>=0;i--) {
            reverse_string = reverse_string+ user_input.charAt(i);
        }
        if (reverse_string.equalsIgnoreCase(user_input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
