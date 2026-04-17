package ex_17_this_keyword;

public class Staticdemo {

    static int a=10;
    int b= 20;

    static void m1() //Static method
    {
        System.out.println("This is m1 static method...");
    }

    void m2() //Non-Static method
    {
        System.out.println("This is m2 non-static method...");
    }

    void m() //non-static method
    {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

   /* public static void main(String[] args) {

        // 1) Static methods can be accessed directly (without object)
      //  System.out.println(a);
       // m1();

       // System.out.println(b); // cannot access, b is non static
      //  m2();

       // 2) Static method can access non-static stuff through object

        Staticdemo std = new Staticdemo();
       /* System.out.println(std.b);
        std.m2();
        std.m();

    } */
}
