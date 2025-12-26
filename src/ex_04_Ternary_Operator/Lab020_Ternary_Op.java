package ex_04_Ternary_Operator;

public class Lab020_Ternary_Op {
    public static void main(String[] args) {
        int a=55;
        int b=65;
        int c=75;
        int max = a>b ? a : ((b>c) ? b:c);
        System.out.println(max);
    }
}
