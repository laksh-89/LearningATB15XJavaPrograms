package Coding_test;

public class Positive_Negative_or_Zero {
    public static void main(String[] args) {
        //int num=50;
       int num=-151;
        //int num=0;
        String result= (num>0) ? "Positive": (num<0) ? "Negative" : "zero";
        System.out.println("The Number is: " +result);
    }
}
