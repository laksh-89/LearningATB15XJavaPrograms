package ex_04_Ternary_Operator;

public class Lab022_Max_Min_Ternary_op {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int max = x>y ? x : y;
        int min = x>y ? y : x;
        System.out.println(max);
        System.out.println(min);
    }
}
