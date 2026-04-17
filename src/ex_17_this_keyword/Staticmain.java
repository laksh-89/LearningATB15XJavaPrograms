package ex_17_this_keyword;

public class Staticmain {

    public static void main(String[] args) {

        // 1) Static methods can be accessed directly (without object)
        System.out.println(Staticdemo.a);
        Staticdemo.m1();

        // System.out.println(b); // cannot access, b is non static
        //  m2();

        // 2) Static method can access non-static stuff through object

        Staticdemo std = new Staticdemo();
        System.out.println(std.b);
        std.m2();
        std.m();
    }
}
