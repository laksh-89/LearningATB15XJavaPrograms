package ex_04_Ternary_Operator;

public class Lab019_Nested_Ternary_op {
    public static void main(String[] args) {
        int a=25;
        String result= a>18 ? (a>25 ? "You can Drink" : "You can't go to Goa") : "no";
        System.out.println(result);
    }
}
