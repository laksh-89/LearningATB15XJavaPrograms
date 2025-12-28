package ex_07_Scan;

public class Largest_of_3_number {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 25;

        if (a > b && a > c) {
            System.out.println("a is largest number");
        } else
            if (b > c) {
                System.out.println("b is largest number");
            } else {
                System.out.println("c is largest number");
            }
        }
    }