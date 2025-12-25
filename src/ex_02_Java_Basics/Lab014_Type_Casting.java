package ex_02_Java_Basics;

public class Lab014_Type_Casting {
    public static void main(String[] args) {
        long phone= 8976543210l;
        //short s= phone; //Narrowing Implicit
        short s1= (short) phone; //Narrowing Explicit
        System.out.println(s1);

    }
}
