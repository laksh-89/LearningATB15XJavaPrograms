package ex_19_Method_Overriding;

class Test
{
    final int x=100;
}



public class finalkeyword {

    public static void main(String[] args) {
        Test t = new Test();
        // t.x=200; Incorrect, Because X is final
        System.out.println(t.x);

    }
}
