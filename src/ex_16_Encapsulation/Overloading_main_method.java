package ex_16_Encapsulation;

public class Overloading_main_method {


    void main (int x)
    {
        System.out.println(x);
    }
    void main (String s)
    {
        System.out.println(s);
    }
    void main (String s1, String s2)
    {
        System.out.println(s1+s2);
    }
    public static void main(String[] args) {

        Overloading_main_method ovm = new Overloading_main_method();
        ovm.main(100);
        ovm.main("Rock");
        ovm.main("Hello", "Rock");

    }
}
