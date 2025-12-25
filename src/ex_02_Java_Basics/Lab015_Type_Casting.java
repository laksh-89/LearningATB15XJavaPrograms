package ex_02_Java_Basics;

public class Lab015_Type_Casting {
    public static void main(String[] args) {
        int a= 100;
        float NSRT_GST=18.45f;
       // int total = a+NSRT_GST; //Narrowing Implicit
        int total= a+(int) NSRT_GST; //Narrowing Explicit
        System.out.println(total);
    }
}
