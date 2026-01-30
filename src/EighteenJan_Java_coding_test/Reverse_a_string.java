package EighteenJan_Java_coding_test;

import java.util.Scanner;

public class Reverse_a_string {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input= sc.nextLine();

        String reverse= " ";

        for (int i=input.length()-1; i>=0;i--){
            reverse= reverse+ input.charAt(i);
        }
        System.out.println("Reverse String: " +reverse);
    }
}
