package ex_02_Java_Basics;

public class Table_of_Nine {
    public static void main(String[] args) {
        int a=9;
        System.out.println("Multiplication table of 9:");
        System.out.println("............................");

        for (int i=1; i<=10; i++){
            System.out.printf("%d * %2d= %2d%n", a, i, (a * i));
        }
    }
}
