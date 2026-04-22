package ex_19_Method_Overriding;

class Test1
{
    final void m()
    {
        System.out.println("This is m method from test class");
    }
}
class Test2 extends Test1
{
    //void m() // Incorrect, Because m is a final method
    {
        System.out.println("This is m method from Test2 class");
    }
}

public class finalkeyword2 {

    public static void main(String[] args) {

    }
}
