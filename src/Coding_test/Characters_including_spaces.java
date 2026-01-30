package Coding_test;

import java.util.Scanner;

public class Characters_including_spaces {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the String: ");
        String input = scanner.nextLine();

        int count = 0;

        for (int i=0; i<input.length();i++) {
            if (input.charAt(i) != ' ') {
                count++;

            }
            System.out.println("Total characters (excluding spaces) : " +count);
        }
    }
}
