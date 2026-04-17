package ex_15_Polymorphism;

public class Method_Overloading_Poly_main {

    public static void main (String[]args) {

        Method_Overloading_Poly Addj = new Method_Overloading_Poly();
        Addj.sum();
        Addj.sum(10,20);
        Addj.sum(25, 10.5);
        Addj.sum(10.9, 10);
        Addj.sum(25,35,45);
        // Addj.sum(10.5,11.5, 12.5);

    }
}
