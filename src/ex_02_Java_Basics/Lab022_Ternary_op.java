package ex_02_Java_Basics;

public class Lab022_Ternary_op {
    public static void main(String[] args) {
        int a=55;
        int b=65;
        int c=75;
        int max = a>b ? a : ((b>c) ? b:c);
        System.out.println(max);
    }
}
