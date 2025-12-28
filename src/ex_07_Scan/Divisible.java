package ex_07_Scan;

public class Divisible {
    public static void main(String[] args) {
        int a=10;

        if (a%5==0 && a%11==0) {
            System.out.println("Divisible by both 5 and 11");
        } else System.out.println("Not Divisible");
    }
}
