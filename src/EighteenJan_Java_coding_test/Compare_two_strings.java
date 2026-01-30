package EighteenJan_Java_coding_test;

import java.util.Scanner;

public class Compare_two_strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1= sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2= sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Both the String are equal");
        } else {
            System.out.println("Both the Strings are not equal");
        }
    }
}
