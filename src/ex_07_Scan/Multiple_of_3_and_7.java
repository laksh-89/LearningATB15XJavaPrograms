package ex_07_Scan;

public class Multiple_of_3_and_7 {
    public static void main(String[] args) {

        int num=21;

        if (num%3==0 || num%7==0) {
            System.out.println("Multiple of 3 & 7");
        } else {
            System.out.println("Not a Multiple of 3 & 7");
        }
    }
}
