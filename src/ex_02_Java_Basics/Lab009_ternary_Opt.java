package ex_02_Java_Basics;

public class Lab009_ternary_Opt {
    public static void main(String[] args) {
        int  marks= 100;
        String result = (marks>=40) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
