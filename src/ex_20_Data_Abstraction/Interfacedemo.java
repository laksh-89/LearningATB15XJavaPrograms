package ex_20_Data_Abstraction;

interface shape
{
    int length= 10; //final & static
    int width= 20; //final static

    void circle(); // abstract method

    default void square()
    {
        System.out.println("This is square - Default method");
    }

    static void rectangle ()
    {
        System.out.println("This is rectangle - static method");
    }
}

public class Interfacedemo implements shape {

    public void circle ()
    {
        System.out.println("This is circle - abstract method");
    }

    void triangle ()
    {
        System.out.println("This is triangle");
    }

    public static void main(String[] args) {

        //Scenario 1
         Interfacedemo idobj= new Interfacedemo();
        idobj.circle(); //abstract method
        idobj.square(); //default method
        shape.rectangle(); //static method can directly access from interface. So, need to mention interface class name
        idobj.triangle();

        //Scenario 2
        shape sh= new Interfacedemo();
        sh.circle(); //abstract method
        sh.square(); //default method
        shape.rectangle();
       // sh.triangle(); //We cannot access it
        System.out.println(shape.length * shape.width); //Accessing static variables directly



    }
}
