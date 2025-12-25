package ex_02_Java_Basics;

public class Lab013_Type_Casting_Narrowing {
    public static void main(String[] args) {
        int val=300;
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0
        //byte b= val; // Imlicit Narrowing This is not possible
        byte b2= (byte) val; // Explicit Narrowing
        System.out.println(b2);
        // 0 0 1 0 1 1 0, // 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44
    }
}
