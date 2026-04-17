package ex_15_Polymorphism;

public class Method_Overloading_Poly {

    //Method name should be same
    //Number of parameters should be different
    //Data types of parameters should be different
    //Order of parameters should be different

    int a= 10;
    int b = 20;

    void sum ()
    {
        System.out.println(a+b);
    }

    void sum (int x, int y)
    {
        System.out.println(x+y);
    }

    void sum (int x, double y)
    {
        System.out.println(x+y);
    }

    void sum (double x, int y)
    {
        System.out.println(x+y);
    }

    void sum (int x, int y, int z)
    {
        System.out.println(x+y+z);
    }
}