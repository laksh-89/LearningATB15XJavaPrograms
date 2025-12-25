package ex_02_Java_Basics;

public class Lab018_Nested_Ternary_Op {
    public static void main(String[] args) {
        int a=25;
        String result= a>18 ? (a>25 ? "You can Drink" : "You can't go to Goa") : "no";
        System.out.println(result);
    }
}
